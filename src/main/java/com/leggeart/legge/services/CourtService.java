package com.leggeart.legge.services;

import com.leggeart.legge.entities.Court;
import com.leggeart.legge.repositories.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class to handle Court class.
 *
 * @author ACh
 * @version 0.0.1
 */
@Service
public class CourtService {

    @Autowired
    private CourtRepository courtRepository;

    public List<Court> getAllCourts() {
        return courtRepository.findAll();
    }

    public Court findCourtById(long courtId) {
        return courtRepository.findById(courtId).orElseThrow();
    }

    public Court createCourt(Court theCourt) {
        Optional<Court> court = courtRepository.findById(theCourt.getId());
        if (!court.isPresent()) {
            return courtRepository.save(theCourt);
        }
        return theCourt;
    }

    public Court updateCourt(Court theCourt) {
        Optional<Court> court = courtRepository.findById(theCourt.getId());
        if (court.isPresent()) {
            return courtRepository.save(theCourt);
        }
        return theCourt;
    }

    public void deleteCourtById(long courtId) {
        courtRepository.deleteById(courtId);
    }
}