package it.alten.gmaferri.pawtropolis.utilities;

import it.alten.gmaferri.pawtropolis.entities.animals.Eagle;
import it.alten.gmaferri.pawtropolis.entities.animals.Lion;
import it.alten.gmaferri.pawtropolis.entities.animals.Tiger;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalFactory {

    private static AnimalFactory instance;

    private AnimalFactory(){}

    public static synchronized AnimalFactory getInstance() {
        if (Objects.isNull(instance))
            instance = new AnimalFactory();
        return instance;
    }

    Random randomizer = new Random();
    String[] names = {"Jose", "Teixeira", "Denis", "Lian", "Luffy", "Titti", "Pippo", "Pluto", "Paperino" };

    String[] favoriteFoods = {"Humans", "Carrots", "Potatoes", "Chicken", "Fish"};

    public LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }

    public Tiger createTiger() {
        return new Tiger(names[randomizer.nextInt(names.length)],
                favoriteFoods[randomizer.nextInt(favoriteFoods.length)],
                randomizer.nextInt(11),
                between(LocalDate.of(2000, 01, 12), LocalDate.now()),
                randomizer.nextDouble(260),
                randomizer.nextDouble(1.2),
                randomizer.nextDouble(90));

    }

    public Lion createLion() {
        return new Lion(names[randomizer.nextInt(names.length)],
                favoriteFoods[randomizer.nextInt(favoriteFoods.length)],
                randomizer.nextInt(11),
                between(LocalDate.of(2000, 01, 12), LocalDate.now()),
                randomizer.nextDouble(260),
                randomizer.nextDouble(1.2),
                randomizer.nextDouble(90));

    }

    public Eagle createEagle(){
        return new Eagle(names[randomizer.nextInt(names.length)],
                favoriteFoods[randomizer.nextInt(favoriteFoods.length)],
                randomizer.nextInt(11),
                between(LocalDate.of(2000, 01, 12), LocalDate.now()),
                randomizer.nextDouble(260),
                randomizer.nextDouble(1.2),
                randomizer.nextDouble(90));
    }
}
