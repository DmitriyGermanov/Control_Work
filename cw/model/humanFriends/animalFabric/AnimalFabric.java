package model.humanFriends.animalFabric;


import view.consoleView.input.animalInput.DataContainer;
import model.humanFriends.animals.Animal;
import model.humanFriends.animals.pets.Cat;
import model.humanFriends.animals.pets.Dog;


public class AnimalFabric {
    Counter counter;

    public AnimalFabric() {
        counter = new Counter();

    }

    public Animal createAnimal(DataContainer dataContainer) {
        if (dataContainer.getType().equals("Dog")) {
            return new Dog(counter.getCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getOwner(), dataContainer.getActivityLevel(),
                    dataContainer.getHomeAddress(), dataContainer.getSize(), dataContainer.getPurpose(),
                    dataContainer.isSterilized(), dataContainer.getPassportNumber());
        } else if (dataContainer.getType().equals("Cat")) {
            return new Cat(counter.getCount());
        } else {
            return null;
        }
    }
}
