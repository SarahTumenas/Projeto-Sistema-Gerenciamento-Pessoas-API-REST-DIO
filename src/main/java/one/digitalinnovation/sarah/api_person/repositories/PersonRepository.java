package one.digitalinnovation.sarah.api_person.repositories;

import one.digitalinnovation.sarah.api_person.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}