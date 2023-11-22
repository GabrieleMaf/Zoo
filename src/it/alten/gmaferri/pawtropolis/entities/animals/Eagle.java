package it.alten.gmaferri.pawtropolis.entities.animals;

import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.WingedAnimal;

import java.time.LocalDate;

public class Eagle extends WingedAnimal {
    public Eagle(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, entryDate, weight, height, wingspan);
    }

    @Override
    public String toString() {
        return String.format("Eagle{%s} ", super.toString());
    }
}



