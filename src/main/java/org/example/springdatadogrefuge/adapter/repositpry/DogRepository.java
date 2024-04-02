package org.example.springdatadogrefuge.adapter.repositpry;

import org.example.springdatadogrefuge.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
