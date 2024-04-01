package org.example.springdatadogrefuge.adapter.rest.controller;

import lombok.RequiredArgsConstructor;
import org.example.springdatadogrefuge.application.service.DogService;
import org.example.springdatadogrefuge.application.service.dto.DogDto;
import org.example.springdatadogrefuge.domain.Dog;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dog")
public class DogController {
    private final DogService dogService;
    private final DogMapper dogMapper;

    @GetMapping("/{id}")
    DogDto getDog(@PathVariable Long id) {
        Dog dog = dogService.getDog(id);
        return dogMapper.toDto(dog);
    }

    @PostMapping
    Long createDog(@RequestBody DogDto request) {
        return dogService.createDog(request);
    }

}
