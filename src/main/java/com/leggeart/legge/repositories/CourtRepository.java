package com.leggeart.legge.repositories;

import com.leggeart.legge.entities.Address;
import com.leggeart.legge.entities.Court;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Repository class to handle Court class.
 *
 * @author ACh
 * @version 0.0.1
 */
@Transactional
@Repository
public interface CourtRepository extends JpaRepository<Court, Long> {

    @Override
    List<Court> findAll();

    @Override
    Optional<Court> findById(Long id);

    @Override
    Court save(Court court);

    @Override
    void deleteById(Long id);
}
