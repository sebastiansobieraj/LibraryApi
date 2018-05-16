package com.crud.library.dao;

import com.crud.library.domain.Readers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ReadersDao extends CrudRepository<Readers, Long> {
    List<Readers> findByNameAndSurname(String name, String surname);

    @Override
    List<Readers> findAll();

}
