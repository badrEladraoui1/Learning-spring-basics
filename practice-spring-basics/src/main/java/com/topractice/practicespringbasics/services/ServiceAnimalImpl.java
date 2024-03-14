package com.topractice.practicespringbasics.services;

import com.topractice.practicespringbasics.dao.entites.Animal;
import com.topractice.practicespringbasics.dao.repositories.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceAnimalImpl implements ServiceAnimal {

    @Autowired
    AnimalRepo animalRepo;

//    @Override
//    public List<Animal> getAllAnimals() {
//        return animalRepo.findAll();
//    }
//
//    @Override
//    public List<Animal> getAnimalsById(Long id1, Long id2, Long id3) {
//        return animalRepo.findAllById(List.of(id1, id2, id3));
//    }

//    @Override
//    public void deleteAnimalsBetween_Age_A_Age_B(Integer A , Integer B) {
//        animalRepo.deleteAnimalsByAgeBetween(A , B);
//    }

//    @Override
//    public Boolean isExistByColor(String color) {
//        return animalRepo.existsByColor(color);
//    }
//    @Override
//    public void addAnimal(Animal animal) {
//        animalRepo.save(animal);
//    }


    @Override
    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<Animal>();
        animalRepo.findAll().forEach(animal -> animals.add(animal));
        return animals;
    }

    @Override
    public Animal getAnimalById(Long id) {
        return animalRepo.findById(id).get();
    }

    @Override
    public Animal delete(Long id) {
        animalRepo.deleteById(id);

    }

    @Override
    public void saveOrUpdate(Animal animal , Long Animalid) {
        animalRepo.save(animal);

    }
}
