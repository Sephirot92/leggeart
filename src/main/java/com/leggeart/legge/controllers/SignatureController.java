package com.leggeart.legge.controllers;

import com.leggeart.legge.dtos.SignatureDto;
import com.leggeart.legge.mappers.SignatureMapper;
import com.leggeart.legge.services.SignatureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle Signature class.
 *
 * @author ACh
 * @version 0.0.1
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/legearte")
public class SignatureController {
    @Autowired
    private SignatureMapper signatureMapper;

    @Autowired
    private SignatureService signatureService;

    private static final Logger logger = LoggerFactory.getLogger(SignatureController.class);

    //TODO refactor controllers for a more civilized way

    @PostMapping(value = "/createSignature")
    private void createSignature(@RequestBody SignatureDto signatureDto) {
        logger.info("Started createSignature in SignatureController.");
        signatureMapper.mapToSignatureDto(signatureService.createSignature(signatureMapper.mapToSignature(signatureDto)));
    }

    @PutMapping(value = "/updateSignature")
    private SignatureDto updateSignature(@RequestBody SignatureDto signatureDto) {
        logger.info("Started updateSignature in SignatureController.");
        return signatureMapper.mapToSignatureDto(signatureService.updateSignature(signatureMapper.mapToSignature(signatureDto)));
    }

    @GetMapping(value = "/getAllSignatures")
    private List<SignatureDto> getAllSignatures() {
        return signatureMapper.mapToSignatureDtoList(signatureService.getAllSignatures());
    }

    @DeleteMapping(value = "/deleteSignature")
    private void deleteSignature(@RequestParam Long signatureId) {
        logger.info("Started deleteSignature in SignatureController.");
        signatureService.deleteSignatureById(signatureId);
    }
}
