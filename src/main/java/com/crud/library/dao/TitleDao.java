package com.crud.library.dao;

import com.crud.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TitleDao extends CrudRepository<Title, Long> {
    List<Title> findByTitleAndAuthorAndAndYearOfPublication(String title, String author, String publicationYear);

    @Override
    List<Title> findAll();
}
