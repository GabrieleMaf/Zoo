package it.alten.gmaferri.pawtropolis.animals;

import it.alten.gmaferri.pawtropolis.animals.model.abstracts.Animal;
import it.alten.gmaferri.pawtropolis.animals.model.abstracts.TailedAnimal;
import it.alten.gmaferri.pawtropolis.animals.model.abstracts.WingedAnimal;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zoo {
    private final Map<Class<? extends Animal>, List<Animal>> animals;

    public Zoo() {
        this.animals = new HashMap<>();
    }

    public Map<Class<? extends Animal>, List<Animal>> getAnimals() {
        return animals;
    }

    public boolean addAnimal(Animal animal) {
        if (!animals.containsKey(animal.getClass()) && !Modifier.isAbstract(animal.getClass().getModifiers())) {
            animals.put(animal.getClass(), new ArrayList<>());
        }
        if(!animals.get(animal.getClass()).contains(animal))
            return animals.get(animal.getClass()).add(animal);
        else
            return false;
    }

    public boolean removeAnimal(Animal animal) {
       return animals.get(animal.getClass()).remove(animal);
    }

    public String showAnimals() {
        return animals.values()
                .stream()
                .flatMap(Collection::stream)
                .toList()
                .stream()
                .map(Animal::toString)
                .collect(Collectors.joining("\n"));
    }


    public <T extends Animal> Optional<Animal> getTallestAnimalByClass(Class<T> tClass) {
        return animals.get(tClass)
                .stream()
                .max(Comparator.comparing(Animal::getWeight));
    }


    public <T extends Animal> Optional<Animal> getShortestAnimalByClass(Class<T> tClass) {
        return  animals.get(tClass)
                .stream()
                .min(Comparator.comparing(Animal::getHeight));
    }

    public <T extends Animal> Optional<Animal> getHeaviestAnimalByClass(Class<T> tClass) {
        return  animals.get(tClass)
                .stream()
                .max(Comparator.comparing(Animal::getWeight));
    }

    public <T extends Animal> Optional<Animal> getLightestAnimalByClass(Class<T> tClass) {
        return  animals.get(tClass)
                .stream()
                .min(Comparator.comparing(Animal::getWeight));
    }

    public <T extends Animal> List<Animal> getAnimalGroup(Class<T> tClass){
        return animals.entrySet()
                .stream()
                .filter(classListEntry -> tClass.isAssignableFrom(classListEntry.getKey()))
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .toList();
    }

    public Optional<TailedAnimal> getLongestTailedAnimal() {
        return getAnimalGroup(TailedAnimal.class)
                .stream()
                .map(TailedAnimal.class::cast)
                .max(Comparator.comparing(TailedAnimal::getTailLength));
    }

   public Optional<WingedAnimal> getWidestWingspanAnimal() {
        return getAnimalGroup(WingedAnimal.class)
                .stream()
                .map(WingedAnimal.class::cast)
                .max(Comparator.comparing(WingedAnimal::getWingspan));
    }

}
