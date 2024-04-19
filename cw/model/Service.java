package model;

import model.humanFriends.animals.Animal;
import model.humanFriends.animalFabric.Counter;

public class Service {
    private final AnimalList<Animal> animalList;
    private final Counter counter;

    public Service() {
        this.animalList = new AnimalList<>();
        this.counter = new Counter();
    }


}
