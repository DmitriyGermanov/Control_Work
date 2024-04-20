package model.humanFriends;

import model.humanFriends.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalList<T extends Animal> {
    private final List<T> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "animals=" + animals +
                '}';
    }

    public boolean add(T animal) {
        if (animal == null) {
            return false;
        } else {
            this.animals.add(animal);
        }
        return true;
    }
}
