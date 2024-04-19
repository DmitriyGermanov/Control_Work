package model.humanFriends.animalFabric;


import model.DataContainer;
import model.humanFriends.animals.Animal;
import model.humanFriends.animals.pets.Cat;
import model.humanFriends.animals.pets.Dog;

public class AnimalFabric {
    Counter counter;
    DataContainer dataContainer;

    public AnimalFabric(DataContainer dataContainer) {
        counter = new Counter();
        this.dataContainer = dataContainer;
    }

    public Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog(counter.getCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
            dataContainer.getTemperament(), dataContainer.getOwner(), dataContainer.getActivityLevel(),
                    dataContainer.getHomeAddress(), dataContainer.getSize(), dataContainer.getBreed(),
                    dataContainer.isSterilized(), dataContainer.getPassportNumber());
        } else if (type.equals("cat")) {
            return new Cat(counter.getCount());
        } else {
            return null;
        }
    }
}
