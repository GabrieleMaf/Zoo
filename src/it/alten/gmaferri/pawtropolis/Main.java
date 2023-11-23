package it.alten.gmaferri.pawtropolis;

import it.alten.gmaferri.pawtropolis.entities.Zoo;
import it.alten.gmaferri.pawtropolis.entities.animals.Eagle;
import it.alten.gmaferri.pawtropolis.entities.animals.Lion;
import it.alten.gmaferri.pawtropolis.entities.animals.Tiger;
import it.alten.gmaferri.pawtropolis.utilities.factory.AnimalFactory;

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
        System.out.println();

        System.out.println(zoo.getTallestAnimalByClass(Tiger.class));
        System.out.println(zoo.getTallestAnimalByClass(Lion.class));
        System.out.println(zoo.getTallestAnimalByClass(Eagle.class));
        System.out.println();

        System.out.println(zoo.getShortestAnimalByClass(Tiger.class));
        System.out.println(zoo.getShortestAnimalByClass(Lion.class));
        System.out.println(zoo.getShortestAnimalByClass(Eagle.class));
        System.out.println();

        System.out.println(zoo.getHeaviestAnimalByClass(Tiger.class));
        System.out.println(zoo.getHeaviestAnimalByClass(Lion.class));
        System.out.println(zoo.getHeaviestAnimalByClass(Eagle.class));
        System.out.println();

        System.out.println(zoo.getLightestAnimalByClass(Tiger.class));
        System.out.println(zoo.getLightestAnimalByClass(Lion.class));
        System.out.println(zoo.getLightestAnimalByClass(Lion.class));
        System.out.println();

        System.out.println(zoo.getLongestTailedAnimal());
        System.out.println(zoo.getWidestWingspanAnimal());


    }
}