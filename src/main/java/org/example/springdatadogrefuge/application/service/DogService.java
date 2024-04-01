package org.example.springdatadogrefuge.application.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.example.springdatadogrefuge.adapter.rest.controller.DogMapper;
import org.example.springdatadogrefuge.application.service.dto.DogDto;
import org.example.springdatadogrefuge.domain.Dog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DogService {
    private final DogRepository dogRepository;
    private final DogMapper dogMapper;

    public Dog getDog(Long id) {
        return dogRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Transactional
    public Long createDog(DogDto request) {
        Dog entity = dogMapper.toEntity(request);
        return dogRepository.save(entity).getId();
    }
}
