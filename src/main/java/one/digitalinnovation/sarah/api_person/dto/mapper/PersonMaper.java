package one.digitalinnovation.sarah.api_person.dto.mapper;

import one.digitalinnovation.sarah.api_person.dto.request.PersonDTO;
import one.digitalinnovation.sarah.api_person.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring")
public interface PersonMaper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}