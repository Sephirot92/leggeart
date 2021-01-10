package com.leggeart.legge;

import java.util.List;
import java.util.Optional;


/**
 Lawsuit service interface.
 @version 0.0.1
 @author LC
 */
public interface LawsuitService {

    List<Lawsuit> findAll();

    Optional<Lawsuit> findById(int lawsuitId);

    void save(Lawsuit theLawsuit);

    void deleteById(int lawsuitId);
}
