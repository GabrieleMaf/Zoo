package it.alten.gmaferri.pawtropolis;

import it.alten.gmaferri.pawtropolis.entities.Zoo;
import it.alten.gmaferri.pawtropolis.entities.animals.Eagle;
import it.alten.gmaferri.pawtropolis.entities.animals.Lion;
import it.alten.gmaferri.pawtropolis.entities.animals.Tiger;
import it.alten.gmaferri.pawtropolis.utilities.AnimalFactory;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        AnimalFactory animalFactory = AnimalFactory.getInstance();

        Tiger tiger1 = animalFactory.createTiger();
        Tiger tiger2 = animalFactory.createTiger();
        Tiger tiger3 = animalFactory.createTiger();

        Eagle eagle1 = animalFactory.createEagle();
        Eagle eagle2 = animalFactory.createEagle();
        Eagle eagle3 = animalFactory.createEagle();

        Lion lion1 = animalFactory.createLion();
        Lion lion2 = animalFactory.createLion();
        Lion lion3 = animalFactory.createLion();

        zoo.addAnimal(tiger1);
        zoo.addAnimal(tiger2);
        zoo.addAnimal(tiger3);

        zoo.addAnimal(eagle1);
        zoo.addAnimal(eagle2);
        zoo.addAnimal(eagle3);

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        System.out.println(zoo.showAnimals());

        System.out.println(zoo.getTallestTiger());
        System.out.println(zoo.getTallestLion());
        System.out.println(zoo.getTallestEagle());
        System.out.println();

        System.out.println(zoo.getShortestTiger());
        System.out.println(zoo.getShortestLion());
        System.out.println(zoo.getShortestEagle());
        System.out.println();

        System.out.println(zoo.getHeaviestTiger());
        System.out.println(zoo.getHeaviestLion());
        System.out.println(zoo.getHeaviestEagle());
        System.out.println();

        System.out.println(zoo.getLightestTiger());
        System.out.println(zoo.getLightestEagle());
        System.out.println(zoo.getLightestLion());
        System.out.println();

        System.out.println(zoo.getLongestTailedAnimal());
        System.out.println(zoo.getWidestWingspanAnimal());


    }
}