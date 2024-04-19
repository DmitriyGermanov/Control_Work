package model;

import model.humanFriends.AnimalList;
import model.humanFriends.animalFabric.AnimalFabric;
import model.humanFriends.animals.Animal;
import model.humanFriends.animalFabric.Counter;

public class Service {
    private final AnimalList<Animal> animalList;
    private final Counter counter;
    private AnimalFabric animalFabric;
    private DataContainer dataContainer;

    public Service() {
        this.animalList = new AnimalList<>();
        this.counter = new Counter();
        this.dataContainer = new DataContainer();
    }


    public void setAnimalName(String name) {
        dataContainer.setName(name);
    }
}
