package com.leggeart.legge.repositories;

import com.leggeart.legge.entities.Lawsuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 Repository class to handle Lawsuit class.

 @version 0.0.1
 @author LC
 */
@Transactional
@Repository
public interface LawsuitRepository extends JpaRepository<Lawsuit, Long> {

    @Override
    List<Lawsuit> findAll();

    @Override
    Optional<Lawsuit> findById(Long id);

    @Override
    Lawsuit save(Lawsuit lawsuit);

    @Override
    void deleteById(Long aLong);
}
