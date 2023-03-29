package fr.uga.l3miage.photonum.domain.mapper;

import java.util.Collection;

import org.mapstruct.Mapper;

import fr.uga.l3miage.photonum.domain.DTO.AddressDTO;
import fr.uga.l3miage.photonum.domain.model.Address;

@Mapper
public interface AddressMapper {
    AddressDTO entityToDTO(Address address);

    Collection<AddressDTO> entityToDTO(Iterable<Address> addresses);
}