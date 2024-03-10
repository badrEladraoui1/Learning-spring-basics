package com.topractice.practicespringbasics.services;

import com.topractice.practicespringbasics.dao.entites.Animal;

import java.util.Iterator;
import java.util.List;

public interface ServiceAnimal {

    List<Animal> getAllAnimals();
    List<Animal> getAnimalsById(Long id1, Long id2, Long id3);
//    void deleteAnimalsBetween_Age_A_Age_B(Integer ageA , Integer ageB);
    Boolean isExistByColor(String color);
    void addAnimal(Animal animal);
}
