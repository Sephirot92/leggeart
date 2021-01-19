package com.leggeart.legge.controllers;

import com.leggeart.legge.dtos.LawsuitDto;
import com.leggeart.legge.mappers.LawsuitMapper;
import com.leggeart.legge.services.LawsuitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle Lawsuit class.
 *
 * @author ACh
 * @version 0.0.1
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/legearte")
public class LawsuitController {

    @Autowired
    private LawsuitMapper lawsuitMapper;

    @Autowired
    private LawsuitService lawsuitService;

    private static final Logger logger = LoggerFactory.getLogger(LawsuitController.class);

    //TODO refactor controllers for a more civilized way

    @PostMapping(value = "/createLawsuit")
    private void createLawsuit(@RequestBody LawsuitDto lawsuitDto) {
        logger.info("Started createLawsuit in LawsuitController.");
        lawsuitMapper.mapToLawsuitDto(lawsuitService.createLawsuit(lawsuitMapper.mapToLawsuit(lawsuitDto)));
    }

    @PutMapping(value = "/updateLawsuit")
    private LawsuitDto updateLawsuit(@RequestBody LawsuitDto lawsuitDto) {
        logger.info("Started updateLawsuit in LawsuitController.");
        return lawsuitMapper.mapToLawsuitDto(lawsuitService.updateLawsuit(lawsuitMapper.mapToLawsuit(lawsuitDto)));
    }

    @GetMapping(value = "/getAllLawsuits")
    private List<LawsuitDto> getAllLawsuits() {
        return lawsuitMapper.mapToLawsuitDtoList(lawsuitService.getAllLawsuits());
    }

    @DeleteMapping(value = "/deleteLawsuit")
    private void deleteLawsuit(@RequestParam Long lawsuitId) {
        logger.info("Started deleteLawsuit in LawsuitController.");
        lawsuitService.deleteLawsuitById(lawsuitId);
    }
}
