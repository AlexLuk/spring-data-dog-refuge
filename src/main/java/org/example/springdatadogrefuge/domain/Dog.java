package org.example.springdatadogrefuge.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.springdatadogrefuge.application.service.dto.ToyDto;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "hibernate_sequence", schema = "refuge")
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @JdbcTypeCode(SqlTypes.JSON)
    private ToyDto toy;

}
