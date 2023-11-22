package it.alten.gmaferri.pawtropolis.entities;

import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.Animal;
import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.TailedAnimal;
import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.WingedAnimal;
import it.alten.gmaferri.pawtropolis.entities.animals.Eagle;
import it.alten.gmaferri.pawtropolis.entities.animals.Lion;
import it.alten.gmaferri.pawtropolis.entities.animals.Tiger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zoo {

    private final List<Animal> animals;
    private final List<Tiger> tigers;
    private final List<Lion> lions;
    private final List<Eagle> eagles;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.tigers = new ArrayList<>();
        this.eagles = new ArrayList<>();
        this.lions = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Tiger> getTigers() {
        return tigers;
    }

    public List<Eagle> getEagles() {
        return eagles;
    }

    public List<Lion> getLions() {
        return lions;
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
            switch (animal) {
                case Tiger tiger:
                    tigers.add(tiger);
                    break;
                case Eagle eagle:
                    eagles.add(eagle);
                    break;
                case Lion lion:
                    lions.add(lion);
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized Animal");
            }
        }
    }

    public void removeAnimal(Animal animal) {
        if (!(animals.remove(animal)))
            throw new IllegalArgumentException("Animal not found");
        switch (animal) {
            case Tiger tiger:
                if (!(tigers.remove(tiger)))
                    throw new IllegalArgumentException("Tiger not found");
                break;
            case Eagle eagle:
                if (!(eagles.remove(eagle)))
                    throw new IllegalArgumentException("Eagle not found");
                break;
            case Lion lion:
                if (!(lions.remove(lion)))
                    throw new IllegalArgumentException("Lion not found");
                break;
            default:
                throw new IllegalArgumentException("Unrecognized Animal");
        }
    }

    public String showAnimals() {
        StringBuilder result = new StringBuilder();
        for (Animal animal : animals) result.append(animal).append("\n");
        return result.toString();
    }

    //HeightMethods
    public Tiger getTallestTiger() {
        if (!tigers.isEmpty())
            return tigers.stream().max(Comparator.comparing(Tiger::getHeight)).get();
        else
            throw new IllegalArgumentException("No tiger found");
    }

    public Tiger getShortestTiger() {
        if (!tigers.isEmpty())
            return tigers.stream().min(Comparator.comparing(Tiger::getHeight)).get();
        else
            throw new IllegalArgumentException("No tiger found");
    }

    public Lion getTallestLion() {
        if (!lions.isEmpty())
            return lions.stream().max(Comparator.comparing(Lion::getHeight)).get();
        else
            throw new IllegalArgumentException("No Lion found");
    }

    public Lion getShortestLion() {
        if (!lions.isEmpty())
            return lions.stream().min(Comparator.comparing(Lion::getHeight)).get();
        else
            throw new IllegalArgumentException("No Lion found");
    }

    public Eagle getTallestEagle() {
        if (!eagles.isEmpty())
            return eagles.stream().max(Comparator.comparing(Eagle::getHeight)).get();
        else
            throw new IllegalArgumentException("No eagle found");
    }

    public Eagle getShortestEagle() {
        if (!eagles.isEmpty())
            return eagles.stream().min(Comparator.comparing(Eagle::getHeight)).get();
        else
            throw new IllegalArgumentException("No eagle found");
    }


    //WeightMethods
    public Tiger getHeaviestTiger() {
        if (!tigers.isEmpty())
            return tigers.stream().max(Comparator.comparing(Tiger::getWeight)).get();
        else
            throw new IllegalArgumentException("No tiger found");
    }

    public Tiger getLightestTiger() {
        if (!tigers.isEmpty())
            return tigers.stream().min(Comparator.comparing(Tiger::getWeight)).get();
        else
            throw new IllegalArgumentException("No tiger found");
    }

    public Lion getHeaviestLion() {
        if (!lions.isEmpty())
            return lions.stream().max(Comparator.comparing(Lion::getWeight)).get();
        else
            throw new IllegalArgumentException("No Lion found");
    }

    public Lion getLightestLion() {
        if (!lions.isEmpty())
            return lions.stream().min(Comparator.comparing(Lion::getWeight)).get();
        else
            throw new IllegalArgumentException("No Lion found");
    }

    public Eagle getHeaviestEagle() {
        if (!eagles.isEmpty())
            return eagles.stream().max(Comparator.comparing(Eagle::getWeight)).get();
        else
            throw new IllegalArgumentException("No eagle found");
    }

    public Eagle getLightestEagle() {
        if (!eagles.isEmpty())
            return eagles.stream().min(Comparator.comparing(Eagle::getWeight)).get();
        else
            throw new IllegalArgumentException("No eagle found");
    }


    public TailedAnimal getLongestTailedAnimal() {
        List<TailedAnimal> tailedAnimals = new ArrayList<>();
        tailedAnimals.addAll(lions);
        tailedAnimals.addAll(tigers);
        if (!tailedAnimals.isEmpty())
            return tailedAnimals.stream().max(Comparator.comparing(TailedAnimal::getTailLength)).get();
        else
            throw new IllegalArgumentException("No tailed animal found");

    }

    public WingedAnimal getWidestWingspanAnimal() {
        List<WingedAnimal> wingedAnimals = new ArrayList<>();
        wingedAnimals.addAll(eagles);
        if (!wingedAnimals.isEmpty())
            return wingedAnimals.stream().max(Comparator.comparing(WingedAnimal::getWingspan)).get();
        else
            throw new IllegalArgumentException("No winged animal found");
    }


}
