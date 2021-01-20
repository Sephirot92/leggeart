package com.leggeart.legge.mappers;

import com.leggeart.legge.dtos.SignatureDto;
import com.leggeart.legge.entities.Signature;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * Mapper class to handle Signature class.
 *
 * @author ACh
 * @version 0.0.1
 */
@Component
public class SignatureMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Signature mapToSignature(final SignatureDto signatureDto) {
        return modelMapper.map(signatureDto, Signature.class);
    }

    public SignatureDto mapToSignatureDto(final Signature signature) {
        return modelMapper.map(signature, SignatureDto.class);
    }

    public List<Signature> mapToSignatureList(List<SignatureDto> signatureDtoList) {
        return signatureDtoList.stream()
                .map(this::mapToSignature)
                .collect(Collectors.toList());
    }

    public List<SignatureDto> mapToSignatureDtoList(List<Signature> signatureList) {
        return signatureList.stream()
                .map(this::mapToSignatureDto)
                .collect(Collectors.toList());
    }

    public Set<Signature> mapToSignatureSet(Set<SignatureDto> signatureDtoSet) {
        return signatureDtoSet.stream()
                .map(this::mapToSignature)
                .collect(Collectors.toSet());
    }

    public Set<SignatureDto> mapToSignatureDtoSet(Set<Signature> signatureSet) {
        return signatureSet.stream()
                .map(this::mapToSignatureDto)
                .collect(Collectors.toSet());
    }
}
