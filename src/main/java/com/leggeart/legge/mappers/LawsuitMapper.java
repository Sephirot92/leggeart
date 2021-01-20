package com.leggeart.legge.mappers;

import com.leggeart.legge.dtos.LawsuitDto;
import com.leggeart.legge.entities.Lawsuit;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mapper class to handle Lawsuit class.
 *
 * @author ACh
 * @version 0.0.2
 */
@Component
public class LawsuitMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Lawsuit mapToLawsuit(final LawsuitDto lawsuitDto) {
        return modelMapper.map(lawsuitDto, Lawsuit.class);
    }

    public LawsuitDto mapToLawsuitDto(final Lawsuit lawsuit) {
        return modelMapper.map(lawsuit, LawsuitDto.class);
    }

    public List<Lawsuit> mapToLawsuitList(List<LawsuitDto> lawsuitDtoList) {
        return lawsuitDtoList.stream()
                .map(this::mapToLawsuit)
                .collect(Collectors.toList());
    }

    public List<LawsuitDto> mapToLawsuitDtoList(List<Lawsuit> lawsuitList) {
        return lawsuitList.stream()
                .map(this::mapToLawsuitDto)
                .collect(Collectors.toList());
    }

    public Set<Lawsuit> mapToLawsuitSet(Set<LawsuitDto> lawsuitDtoSet) {
        return lawsuitDtoSet.stream()
                .map(this::mapToLawsuit)
                .collect(Collectors.toSet());
    }

    public Set<LawsuitDto> mapToLawsuitDtoSet(Set<Lawsuit> lawsuitSet) {
        return lawsuitSet.stream()
                .map(this::mapToLawsuitDto)
                .collect(Collectors.toSet());
    }
}
