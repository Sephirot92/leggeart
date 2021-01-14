package com.leggeart.legge.controllers;

import com.leggeart.legge.dtos.AddressDto;
import com.leggeart.legge.mappers.AddressMapper;
import com.leggeart.legge.services.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle Address class.
 *
 * @author ACh
 * @version 0.0.1
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/legearte")
public class AddressController {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressService addressService;

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    //TODO refactor controllers for a more civilized way

    @PostMapping(value = "/createAddress")
    private void createAddress(@RequestBody AddressDto addressDto) {
        logger.info("Started createAddress in AddressController.");
        addressMapper.mapToAddressDto(addressService.createAddress(addressMapper.mapToAddress(addressDto)));
    }

    @PutMapping(value = "/updateAddress")
    private AddressDto updateAddress(@RequestBody AddressDto addressDto) {
        logger.info("Started updateAddress in AddressController.");
        return addressMapper.mapToAddressDto(addressService.updateAddress(addressMapper.mapToAddress(addressDto)));
    }

    @GetMapping(value = "/getAllAddresss")
    private List<AddressDto> getAllAddresss() {
        return addressMapper.mapToAddressDtoList(addressService.getAllAddresses());
    }

    @DeleteMapping(value = "/deleteAddress")
    private void deleteAddress(@RequestParam Long addressId) {
        logger.info("Started deleteAddress in AddressController.");
        addressService.deleteAddressById(addressId);
    }
}
