package com.leggeart.legge.controllers;

import com.leggeart.legge.dtos.CourtDto;
import com.leggeart.legge.mappers.CourtMapper;
import com.leggeart.legge.services.CourtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle Court class.
 *
 * @author ACh
 * @version 0.0.1
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/legearte")
public class CourtController {
    @Autowired
    private CourtMapper courtMapper;

    @Autowired
    private CourtService courtService;

    private static final Logger logger = LoggerFactory.getLogger(CourtController.class);

    //TODO refactor controllers for a more civilized way

    @PostMapping(value = "/createCourt")
    private void createCourt(@RequestBody CourtDto courtDto) {
        logger.info("Started createCourt in CourtController.");
        courtMapper.mapToCourtDto(courtService.createCourt(courtMapper.mapToCourt(courtDto)));
    }

    @PutMapping(value = "/updateCourt")
    private CourtDto updateCourt(@RequestBody CourtDto courtDto) {
        logger.info("Started updateCourt in CourtController.");
        return courtMapper.mapToCourtDto(courtService.updateCourt(courtMapper.mapToCourt(courtDto)));
    }

    @GetMapping(value = "/getAllCourts")
    private List<CourtDto> getAllCourts() {
        return courtMapper.mapToCourtDtoList(courtService.getAllCourts());
    }

    @DeleteMapping(value = "/deleteCourt")
    private void deleteCourt(@RequestParam Long courtId) {
        logger.info("Started deleteCourt in CourtController.");
        courtService.deleteCourtById(courtId);
    }
}
