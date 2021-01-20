package com.leggeart.legge.mappers;

import com.leggeart.legge.dtos.CourtDto;
import com.leggeart.legge.entities.Court;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mapper class to handle Court class.
 *
 * @author ACh
 * @version 0.0.1
 */
@Component
public class CourtMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Court mapToCourt(final CourtDto courtDto) {
        return modelMapper.map(courtDto, Court.class);
    }

    public CourtDto mapToCourtDto(final Court court) {
        return modelMapper.map(court, CourtDto.class);
    }

    public List<Court> mapToCourtList(List<CourtDto> courtDtoList) {
        return courtDtoList.stream()
                .map(this::mapToCourt)
                .collect(Collectors.toList());
    }

    public List<CourtDto> mapToCourtDtoList(List<Court> courtList) {
        return courtList.stream()
                .map(this::mapToCourtDto)
                .collect(Collectors.toList());
    }

    public Set<Court> mapToCourtSet(Set<CourtDto> courtDtoSet) {
        return courtDtoSet.stream()
                .map(this::mapToCourt)
                .collect(Collectors.toSet());
    }

    public Set<CourtDto> mapToCourtDtoSet(Set<Court> courtSet) {
        return courtSet.stream()
                .map(this::mapToCourtDto)
                .collect(Collectors.toSet());
    }
}
