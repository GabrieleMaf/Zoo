package it.alten.gmaferri.pawtropolis.entities;

import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.Animal;
import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.TailedAnimal;
import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.WingedAnimal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo{

    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }
    public void addAnimal(Animal animal) {
        if (!animals.contains(animal))
            animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        if (!(animals.remove(animal)))
            throw new IllegalArgumentException("Animal not found");
        }

    public String showAnimals() {
        return animals.stream().map(Animal::toString).collect(Collectors.joining("\n"));
    }

    public <T extends Animal> T getTallestAnimal(Class<T> tClass) {
        return tClass.cast(animals.stream()
                .filter(tClass::isInstance)
                .max(Comparator.comparing(Animal::getHeight))
                .orElseThrow(() -> new IllegalArgumentException(String.format("No %s found", tClass.getSimpleName()))));
    }

    public <T extends Animal> T getShortestAnimal(Class<T> tClass) {
        return tClass.cast(animals.stream()
                .filter(tClass::isInstance)
                .min(Comparator.comparing(Animal::getHeight))
                .orElseThrow(() -> new IllegalArgumentException(String.format("No %s found", tClass.getSimpleName()))));
    }

    public <T extends Animal> T getHeaviestAnimal(Class<T> tClass) {
        return tClass.cast(animals.stream()
                .filter(tClass::isInstance)
                .max(Comparator.comparing(Animal::getWeight))
                .orElseThrow(() -> new IllegalArgumentException(String.format("No %s found", tClass.getSimpleName()))));
    }

    public <T extends Animal> T getLightestAnimal(Class<T> tClass) {
        return tClass.cast(animals.stream()
                .filter(tClass::isInstance)
                .min(Comparator.comparing(Animal::getWeight))
                .orElseThrow(() -> new IllegalArgumentException(String.format("No %s found", tClass.getSimpleName()))));
    }
    public TailedAnimal getLongestTailedAnimal() {
            return animals.stream()
                    .filter(TailedAnimal.class::isInstance)
                    .map(TailedAnimal.class::cast)
                    .max(Comparator.comparing(TailedAnimal::getTailLength))
                    .orElseThrow(() -> new IllegalArgumentException("No tailed animal found"));

    }

    public WingedAnimal getWidestWingspanAnimal() {
            return animals.stream()
                    .filter(WingedAnimal.class::isInstance)
                    .map(WingedAnimal.class::cast)
                    .max(Comparator.comparing(WingedAnimal::getWingspan))
                    .orElseThrow(() -> new IllegalArgumentException("No winged animal found"));
    }

}
