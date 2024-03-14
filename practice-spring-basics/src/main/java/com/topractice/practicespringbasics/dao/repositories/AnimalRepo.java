package com.topractice.practicespringbasics.dao.repositories;

import com.topractice.practicespringbasics.dao.entites.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepo extends JpaRepository<Animal, Long> {

    Animal findByName(String name);

//    List<Animal> findAllById(Iterable<Long> iterable);

    //    void deleteAnimalsByAgeBetween(Integer age1 , Integer age2);
//    Boolean existsByColor(String color);


}
