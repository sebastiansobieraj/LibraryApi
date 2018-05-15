package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RENTALS")
public class Rentals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name = "rent_date")
    private LocalDate dateOfRent;

    @Column(name = "return_date")
    private LocalDate dateOfReturn;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "piece_id")
    private Piece piece;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Readers readers;
}
