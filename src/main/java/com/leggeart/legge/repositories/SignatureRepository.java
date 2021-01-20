package com.leggeart.legge.repositories;

import com.leggeart.legge.entities.Signature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repository class to handle Signature class.
 *
 * @author ACh
 * @version 0.0.1
 */
public interface SignatureRepository extends JpaRepository<Signature, Long> {

    @Override
    List<Signature> findAll();

    @Override
    Optional<Signature> findById(Long id);

    @Override
    Signature save(Signature signature);

    @Override
    void deleteById(Long id);
}
