package it.alten.gmaferri.pawtropolis.entities;

import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.Animal;
import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.TailedAnimal;
import it.alten.gmaferri.pawtropolis.entities.animals.abstracts.WingedAnimal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public boolean addAnimal(Animal animal) {
        if (!animals.contains(animal))
            return animals.add(animal);
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    public String showAnimals() {
        return animals.stream().
                map(Animal::toString).
                collect(Collectors.joining("\n"));
    }

    public <T extends Animal> Optional<Animal> getTallestAnimalByClass(Class<T> tClass) {
        return animals.stream()
                .filter(tClass::isInstance)
                .max(Comparator.comparing(Animal::getWeight));
    }


    public <T extends Animal> Optional<Animal> getShortestAnimalByClass(Class<T> tClass) {
        return animals.stream()
                .filter(tClass::isInstance)
                .min(Comparator.comparing(Animal::getHeight));
    }

    public <T extends Animal> Optional<Animal> getHeaviestAnimalByClass(Class<T> tClass) {
        return animals.stream()
                .filter(tClass::isInstance)
                .max(Comparator.comparing(Animal::getWeight));
    }

    public <T extends Animal> Optional<Animal> getLightestAnimalByClass(Class<T> tClass) {
        return animals.stream()
                .filter(tClass::isInstance)
                .min(Comparator.comparing(Animal::getWeight));
    }

    public TailedAnimal getLongestTailedAnimal() {
        return animals.stream()
                .filter(TailedAnimal.class::isInstance)
                .map(TailedAnimal.class::cast)
                .max(Comparator.comparing(TailedAnimal::getTailLength))
                .orElse(null);

    }

    public WingedAnimal getWidestWingspanAnimal() {
        return animals.stream()
                .filter(WingedAnimal.class::isInstance)
                .map(WingedAnimal.class::cast)
                .max(Comparator.comparing(WingedAnimal::getWingspan))
                .orElse(null);
    }

}
