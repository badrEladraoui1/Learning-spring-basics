package com.topractice.practicespringbasics.web;

import com.topractice.practicespringbasics.dao.entites.Animal;
import com.topractice.practicespringbasics.services.ServiceAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    ServiceAnimal serviceAnimal;

    @GetMapping("/animals")
    List<Animal> getAnimals() {
        return serviceAnimal.getAllAnimals();
    }

    @GetMapping("/animals-by-id")
    List<Animal> getAnimalsById(){
        return serviceAnimal.getAnimalsById(1L , 4L , 9L);
    }

//    @GetMapping("/animals-after-deletion")
//    List<Animal> getAnimalsAfterDeletion(){
//        serviceAnimal.deleteAnimalsBetween_Age_A_Age_B(3 , 7);
//        return serviceAnimal.getAllAnimals();
//    }

    @GetMapping("/animalExist-by-color")
    Boolean existByColor(){
        return serviceAnimal.isExistByColor("Black");
    }

    void addAnimal(){
        serviceAnimal.addAnimal(new Animal(null,"Komodo Dragon", 7, "Lizard", 10.0, "Black"));
    }

}
