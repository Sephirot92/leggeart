package com.leggeart.legge;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LawsuitServiceImpl implements  LawsuitService{

    @Autowired
    private LawsuitRepository lawsuitRepository;

    public LawsuitServiceImpl(LawsuitRepository lawsuitRepository) {
        this.lawsuitRepository = lawsuitRepository;
    }

    @Override
    public List<Lawsuit> findAll() {
        return lawsuitRepository.findAll();
    }

    @Override
    public Optional<Lawsuit> findById(int lawsuitId) {
        return lawsuitRepository.findById(lawsuitId);
    }

    @Override
    public void save(Lawsuit theLawsuit) {
        lawsuitRepository.save(theLawsuit);
    }

    @Override
    public void deleteById(int lawsuitId) {
        lawsuitRepository.deleteById(lawsuitId);
    }
}
