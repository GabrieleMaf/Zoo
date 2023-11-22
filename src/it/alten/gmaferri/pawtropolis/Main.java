package it.alten.gmaferri.pawtropolis;

import it.alten.gmaferri.pawtropolis.entities.Zoo;
import it.alten.gmaferri.pawtropolis.entities.animals.Eagle;
import it.alten.gmaferri.pawtropolis.entities.animals.Lion;
import it.alten.gmaferri.pawtropolis.entities.animals.Tiger;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Tiger tiger1 = new Tiger("AlejandroCoulibaly", "anrSs5z", 35, LocalDate.of(2023, 11, 30), 401, 4.41, 7);
        Tiger tiger2 = new Tiger("HugoLeon", "oIjXIpaBPE", 12, LocalDate.of(2017, 11, 30), 89, 1.79, 16);
        Tiger tiger3 = new Tiger("SergioKumar", "tiiIYcfVH", 5, LocalDate.of(2015, 11, 30), 100, 2.97, 15);

        Eagle eagle1 = new Eagle("FatemehPu", "OLxv4fLFGr", 10, LocalDate.of(2015, 5, 15), 26, 1.00, 19);
        Eagle eagle2 = new Eagle("MargaritaSong", "o1NhQDqwsG", 14, LocalDate.of(2013, 7, 15), 23, 4.74, 17);
        Eagle eagle3 = new Eagle("EmmanuelChi", "zA3brLbxB", 7, LocalDate.of(2015, 6, 12), 69, 7.96, 15);

        Lion lion1 = new Lion("NikolayMai", "anrSs5z", 35, LocalDate.of(2023, 11, 30), 481, 1.31, 6);
        Lion lion2 = new Lion("ArmandoSah", "OFVGm1uzN", 3, LocalDate.of(2023, 10, 30), 351, 1.41, 7);
        Lion lion3 = new Lion("AnitaRuiz", "bKheDr3", 4, LocalDate.of(2023, 7, 30), 463, 1.26, 8);

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