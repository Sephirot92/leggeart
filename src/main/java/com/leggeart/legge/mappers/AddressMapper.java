package com.leggeart.legge.mappers;

import com.leggeart.legge.dtos.AddressDto;
import com.leggeart.legge.entities.Address;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mapper class to handle Address class.
 *
 * @author ACh
 * @version 0.0.2
 */
@Component
public class AddressMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Address mapToAddress(final AddressDto addressDto) {
        return modelMapper.map(addressDto, Address.class);
    }

    public AddressDto mapToAddressDto(final Address address) {
        return modelMapper.map(address, AddressDto.class);
    }

    public List<Address> mapToAddressList(List<AddressDto> addressDtoList) {
        return addressDtoList.stream()
                .map(this::mapToAddress)
                .collect(Collectors.toList());
    }

    public List<AddressDto> mapToAddressDtoList(List<Address> addressList) {
        return addressList.stream()
                .map(this::mapToAddressDto)
                .collect(Collectors.toList());
    }

    public Set<Address> mapToAddressSet(Set<AddressDto> addressDtoSet) {
        return addressDtoSet.stream()
                .map(this::mapToAddress)
                .collect(Collectors.toSet());
    }

    public Set<AddressDto> mapToAddressDtoSet(Set<Address> addressSet) {
        return addressSet.stream()
                .map(this::mapToAddressDto)
                .collect(Collectors.toSet());
    }
}