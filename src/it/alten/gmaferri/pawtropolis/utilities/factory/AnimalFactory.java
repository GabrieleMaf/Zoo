package it.alten.gmaferri.pawtropolis.utilities.factory;

import it.alten.gmaferri.pawtropolis.entities.animals.Eagle;
import it.alten.gmaferri.pawtropolis.entities.animals.Lion;
import it.alten.gmaferri.pawtropolis.entities.animals.Tiger;

import java.time.LocalDate;
import java.util.Objects;

import static it.alten.gmaferri.pawtropolis.utilities.factory.RandomizerUtilities.*;

public class AnimalFactory {

    private static AnimalFactory instance;

    private AnimalFactory(){}

    public static synchronized AnimalFactory getInstance() {
        if (Objects.isNull(instance))
            instance = new AnimalFactory();
        return instance;
    }

    public Tiger createTiger() {
        return new Tiger(names[randomizer.nextInt(names.length)],
                favoriteFoods[randomizer.nextInt(favoriteFoods.length)],
                randomizer.nextInt(11),
                between(LocalDate.of(2000, 1, 1), LocalDate.now()),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(225,300))),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(0.85, 1.2))),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(0.65,3))));

    }

    public Lion createLion() {
        return new Lion(names[randomizer.nextInt(names.length)],
                favoriteFoods[randomizer.nextInt(favoriteFoods.length)],
                randomizer.nextInt(11),
                between(LocalDate.of(2000, 1, 1), LocalDate.now()),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(3,7))),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(0.75, 0.84))),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(1.8, 2.3))));

    }

    public Eagle createEagle(){
        return new Eagle(names[randomizer.nextInt(names.length)],
                favoriteFoods[randomizer.nextInt(favoriteFoods.length)],
                randomizer.nextInt(11),
                between(LocalDate.of(2000, 1, 1), LocalDate.now()),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(200, 250))),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(0.9, 1.2))),
                Double.parseDouble(decimalFormat.format(randomizer.nextDouble(0.7, 1))));
    }
}
