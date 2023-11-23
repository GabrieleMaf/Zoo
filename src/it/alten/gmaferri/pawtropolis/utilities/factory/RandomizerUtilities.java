package it.alten.gmaferri.pawtropolis.utilities.factory;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizerUtilities {

    private RandomizerUtilities(){}

    static DecimalFormat decimalFormat =new DecimalFormat("#.##");
    static Random randomizer = new Random();
    static String[] names = {"Jose", "Teixeira", "Denis", "Lian", "Luffy", "Titti", "Pippo", "Pluto", "Paperino" };

    static String[] favoriteFoods = {"Humans", "Carrots", "Potatoes", "Chicken", "Fish"};

    public static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}
