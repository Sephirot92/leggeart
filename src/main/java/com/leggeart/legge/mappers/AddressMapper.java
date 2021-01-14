package com.leggeart.legge.mappers;

import com.leggeart.legge.dtos.AddressDto;
import com.leggeart.legge.entities.Address;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 Mapper class to handle Address class.

 @version 0.0.1
 @author ACh
 */
@Component
public class AddressMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Address mapToAddress (final AddressDto addressDto){
        return modelMapper.map(addressDto, Address.class);
    }

    public AddressDto mapToAddressDto (final Address address){
        return modelMapper.map(address, AddressDto.class);
    }

    public List<Address> mapToAddressList (List<AddressDto> addressDtoList){
        return addressDtoList.stream()
                .map(this::mapToAddress)
                .collect(Collectors.toList());
    }

    public List<AddressDto> mapToAddressDtoList (List<Address> addressList){
        return addressList.stream()
                .map(this::mapToAddressDto)
                .collect(Collectors.toList());
    }
}