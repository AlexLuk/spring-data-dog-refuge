package org.example.springdatadogrefuge.application.service;

import org.example.springdatadogrefuge.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
