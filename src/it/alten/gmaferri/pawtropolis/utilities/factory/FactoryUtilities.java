package it.alten.gmaferri.pawtropolis.utilities.factory;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FactoryUtilities {

    private FactoryUtilities(){}
    public static final DecimalFormat decimalFormat =new DecimalFormat("#.##");
    public static final Random randomizer = new Random();
    public static final String[] names = {"Jose", "Teixeira", "Denis", "Lian", "Luffy", "Titti", "Pippo", "Pluto", "Paperino" };

    public static final String[] favoriteFoods = {"Humans", "Carrots", "Potatoes", "Chicken", "Fish"};

    public static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}
