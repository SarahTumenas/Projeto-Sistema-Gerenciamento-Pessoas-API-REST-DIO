package one.digitalinnovation.sarah.api_person.mapper;

import one.digitalinnovation.sarah.api_person.dto.request.PersonDTO;
import one.digitalinnovation.sarah.api_person.entities.Person;
import org.apache.catalina.mapper.Mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface PersonMaper {

    PersonMaper INSTANCE = Mapper.getMapper(PersonMaper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
