package org.example.springdatadogrefuge.adapter.rest.mapper;

import org.example.springdatadogrefuge.application.service.dto.DogDto;
import org.example.springdatadogrefuge.domain.Dog;
import org.springframework.stereotype.Service;

@Service
public class DogMapper {
    public DogDto toDto(Dog entity) {
        return new DogDto(entity.getId(), entity.getName(), entity.getToy());
    }
    public Dog toEntity(DogDto dto) {
        Dog dog = new Dog();
        dog.setName(dto.name());
        dog.setToy(dto.toy());
        return dog;
    }
}
