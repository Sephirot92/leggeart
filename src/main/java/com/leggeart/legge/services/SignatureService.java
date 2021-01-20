package com.leggeart.legge.services;

import com.leggeart.legge.entities.Signature;
import com.leggeart.legge.repositories.SignatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class to handle Signature class.
 *
 * @author ACh
 * @version 0.0.1
 */
@Service
public class SignatureService {
    @Autowired
    private SignatureRepository signatureRepository;

    public List<Signature> getAllSignatures() {
        return signatureRepository.findAll();
    }

    public Signature findSignatureById(long signatureId) {
        return signatureRepository.findById(signatureId).orElseThrow();
    }

    public Signature createSignature(Signature theSignature) {
        Optional<Signature> signature = signatureRepository.findById(theSignature.getId());
        if (!signature.isPresent()) {
            return signatureRepository.save(theSignature);
        }
        return theSignature;
    }

    public Signature updateSignature(Signature theSignature) {
        Optional<Signature> signature = signatureRepository.findById(theSignature.getId());
        if (signature.isPresent()) {
            return signatureRepository.save(theSignature);
        }
        return theSignature;
    }

    public void deleteSignatureById(long signatureId) {
        signatureRepository.deleteById(signatureId);
    }
}