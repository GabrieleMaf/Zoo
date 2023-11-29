package it.alten.gmaferri.pawtropolis;

import it.alten.gmaferri.pawtropolis.animals.AnimalFactory;
import it.alten.gmaferri.pawtropolis.animals.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        AnimalFactory animalFactory = AnimalFactory.getInstance();

        for(int i=0; i<33000; i++){
            zoo.addAnimal(animalFactory.createTiger());
        }

        for(int i=0; i<33000; i++){
            zoo.addAnimal(animalFactory.createEagle());
        }

        for(int i=0; i<33000; i++){
            zoo.addAnimal(animalFactory.createLion());
        }

        System.out.println(zoo.showAnimals());
        System.out.println();

        /*System.out.printf("The tallest Tiger in zoo is %s\n", zoo.getTallestAnimalByClass(Tiger.class).orElse(null));
        System.out.printf("The tallest Lion in zoo is %s\n", zoo.getTallestAnimalByClass(Eagle.class).orElse(null));
        System.out.printf("The tallest Eagle in zoo is %s\n", zoo.getTallestAnimalByClass(Lion.class).orElse(null));
        System.out.println();

        System.out.printf("The shortest Tiger in zoo is %s\n", zoo.getShortestAnimalByClass(Tiger.class).orElse(null));
        System.out.printf("The shortest Lion in zoo is %s\n", zoo.getShortestAnimalByClass(Eagle.class).orElse(null));
        System.out.printf("The shortest Eagle in zoo is %s\n", zoo.getShortestAnimalByClass(Lion.class).orElse(null));
        System.out.println();

        System.out.println(zoo.getHeaviestAnimalByClass(Tiger.class));
        System.out.println(zoo.getHeaviestAnimalByClass(Lion.class));
        System.out.println(zoo.getHeaviestAnimalByClass(Eagle.class));
        System.out.println();

        System.out.println(zoo.getLightestAnimalByClass(Tiger.class));
        System.out.println(zoo.getLightestAnimalByClass(Lion.class));
        System.out.println(zoo.getLightestAnimalByClass(Eagle.class));
        System.out.println();

        System.out.println(zoo.getLongestTailedAnimal());
        System.out.println(zoo.getWidestWingspanAnimal());
*/

    }
}