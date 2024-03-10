package com.topractice.practicespringbasics;

import com.topractice.practicespringbasics.dao.entites.Animal;
import com.topractice.practicespringbasics.dao.repositories.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class PracticeSpringBasicsApplication implements CommandLineRunner {

	@Autowired
	AnimalRepo animalRepo;

	public static void main(String[] args) {SpringApplication.run(PracticeSpringBasicsApplication.class, args); }


	@Override
	public void run(String... args) throws Exception {

		System.out.println();
		System.out.println("creating animals ....");
		System.out.println();

		// creating animals
		Iterable<Animal> animals = List.of(
				new Animal(null ,"Javan Rhinoceros", 1, "Rhinoceros", 1500.0, "Black"),
				new Animal(null ,"Javan Leopard", 2, "Leopard", 100.0, "Spotted"),
				new Animal(null ,"Javan Gibbon", 3, "Gibbon", 15.0, "Brown"),
				new Animal(null ,"Javan Warty Pig", 4, "Pig", 50.0, "Black"),
				new Animal(null ,"Surili Leaf Monkey", 5, "Monkey", 20.0, "Brown"),
				new Animal(null ,"Slow Loris", 6, "Loris", 10.0, "Black"),
				new Animal(null ,"Komodo Dragon", 7, "Lizard", 10.0, "Black"),
				new Animal(null ,"Javan Tiger", 8, "Tiger", 100.0, "Black"),
				new Animal(null ,"Sun Bear", 9, "Bear", 100.0, "Black"),
				new Animal(null ,"Bekisar", 10, "Rooster", 10.0, "White")
		);

		animalRepo.saveAll(animals);

		System.out.println();
		System.out.println("displaying all animal's names and breeds");
		System.out.println();

		// displaying all animal's names and breeds
		List<Animal> animalList =  animalRepo.findAll();
		for(Animal animal:animalList){
			System.out.println(animal.getName() + animal.getBreed());
		}

		System.out.println();
		System.out.println("finding an animal by id :");
		System.out.println();

		// finding an animal by id :
		Optional<Animal> animal1 = animalRepo.findById(6L);
		System.out.println(animal1);

		System.out.println();
		System.out.println("finding animal by name : ");
		System.out.println();

		// finding animal by name :
		Animal animal2 = animalRepo.findByName("Sun Bear");
		System.out.println(animal2);

		System.out.println();
		System.out.println("deleting by id");
		System.out.println();

		animalRepo.deleteById(7L);


	}
}
