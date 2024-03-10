package com.topractice.practicespringbasics.dao.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Animal {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) //  automatically generate an ID
    private Long id;
    private String name;
    private Integer age;
    private String breed;
    private Double weight;
    private String color;

}
