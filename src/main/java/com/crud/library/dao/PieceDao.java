package com.crud.library.dao;

import com.crud.library.domain.Piece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface PieceDao extends CrudRepository <Piece, Long> {
    List<Piece> findByStatusAndTitle (String status, String title);
}
