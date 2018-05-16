package com.crud.library.dao;

import com.crud.library.domain.Rentals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface RentalsDao extends CrudRepository<Rentals, Long> {
    Optional<List<Rentals>> findByReadersAndAndPiece(Long readerId, Long pieceId);
}
