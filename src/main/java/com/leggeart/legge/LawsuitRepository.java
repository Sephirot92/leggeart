package com.leggeart.legge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 Dao class to handle Lawsuit class.

 @version 0.0.1
 @author LC
 */
@Transactional
@Repository
public interface LawsuitRepository extends JpaRepository<Lawsuit, Integer> {

}
