/*package it.alten.gmaferri.pawtropolis.utilities.factory;

import java.time.LocalDate;
import java.util.Random;

public class AnimalFactory {

    Random randomizer = new Random();
    String[] names = {"Jose", "Teixeira", "Denis", "Lian", "Luffy", "Titti", "Pippo", "Pluto", "Paperino" };

    String[] favoriteFoods = {"Humans", "Carrots", "Potatoes", "Chicken", "Fish"};

    public static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
    long startEpochDay = startInclusive.toEpochDay();
    long endEpochDay = endExclusive.toEpochDay();
    long randomDay = ThreadLocalRandom
      .current()
      .nextLong(startEpochDay, endEpochDay);

    return LocalDate.ofEpochDay(randomDay);
}*/
