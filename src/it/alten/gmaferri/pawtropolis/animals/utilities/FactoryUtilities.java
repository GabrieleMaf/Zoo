package it.alten.gmaferri.pawtropolis.animals.utilities;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FactoryUtilities {

    private FactoryUtilities(){}
    public static final DecimalFormat decimalFormat =new DecimalFormat("#.##");
    public static final Random randomizer = new Random();
    public static final String[] names = {
            "Jose", "Teixeira", "Denis", "Lian", "Luffy", "Titti",
            "Pippo", "Pluto", "Paperino","Monkey", "Tabasco", "Shadow",
            "Mr Dirty", "Vanilla", "Pebbles", "Ashley", "Charcoal", "Puffin",
            "Stewie", "Nermal", "Cinder", "Stormy", "Pebble", "Sputnik", "Bagpuss",
            "Licorice", "Tiddles", "Dusty", "Ismael", "Abraham", "Ash", "Duncan"};

    public static final String[] favoriteFoods = {
            "Humans", "Carrots", "Potatoes", "Chicken", "Fish",
            "Cheese", "Egg", "Butter", "Margarine","Yogurt",
            "Sandwich", "Sausage", "Hamburger"};

    public static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}
