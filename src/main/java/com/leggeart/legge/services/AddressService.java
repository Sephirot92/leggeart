package com.leggeart.legge.services;

import com.leggeart.legge.entities.Address;
import com.leggeart.legge.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
/**
 Service class to handle Address class.

 @version 0.0.1
 @author ACh
 */
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses () {
        return addressRepository.findAll ();
    }

    public Address findAddressById (long addressId) {
        return addressRepository.findById(addressId).orElseThrow();
    }

    public Address createAddress(Address theAddress) {
        Optional<Address> address = addressRepository.findById(theAddress.getId());
        if(!address.isPresent()){
            return addressRepository.save(theAddress);
        }
        return theAddress;
    }

    public void deleteAddressById(long addressId) {
        addressRepository.deleteById(addressId);
    }
}
