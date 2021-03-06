package com.leggeart.legge.repositories;

import com.leggeart.legge.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Repository class to handle Address class.
 *
 * @author ACh
 * @version 0.0.2
 */
@Transactional
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Override
    List<Address> findAll();

    @Override
    Optional<Address> findById(Long id);

    @Override
    Address save(Address address);

    @Override
    void deleteById(Long id);
}
