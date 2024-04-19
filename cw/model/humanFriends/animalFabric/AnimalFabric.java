package model.humanFriends.animalFabric;


import model.humanFriends.animals.Animal;
import model.humanFriends.animals.pets.Cat;
import model.humanFriends.animals.pets.Dog;

public class AnimalFabric {
    Counter counter;

    public AnimalFabric() {
        counter = new Counter();
    }

    public Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog(counter.getCount());
        } else if (type.equals("cat")) {
            return new Cat(counter.getCount());
        } else {
            return null;
        }
    }
}
