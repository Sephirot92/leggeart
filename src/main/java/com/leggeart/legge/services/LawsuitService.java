package com.leggeart.legge.services;

import com.leggeart.legge.entities.Lawsuit;
import com.leggeart.legge.repositories.LawsuitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LawsuitService {

    @Autowired
    private LawsuitRepository lawsuitRepository;

    public List<Lawsuit> getAllLawsuits () {
        return lawsuitRepository.findAll ();
    }

    public Lawsuit findLawsuitById (long lawsuitId) {
        return lawsuitRepository.findById(lawsuitId).orElseThrow();
    }

    public Lawsuit createLawsuit(Lawsuit theLawsuit) {
        Optional<Lawsuit> lawsuit = lawsuitRepository.findById(theLawsuit.getId());
        if(!lawsuit.isPresent()){
            return lawsuitRepository.save(theLawsuit);
        }
        return theLawsuit;
    }

    public void deleteLawsuitById(long lawsuitId) {
        lawsuitRepository.deleteById(lawsuitId);
    }
}
