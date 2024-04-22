package model.humanFriends.animalFabric;


import model.humanFriends.animals.packAnimals.Camel;
import model.humanFriends.animals.packAnimals.Donkey;
import model.humanFriends.animals.packAnimals.Horse;
import model.humanFriends.animals.pets.Hamster;
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
        if (dataContainer.getType().equals("Собака")) {
            counter.addPetCounter();
            return new Dog(counter.getAndAddCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getCommands(), dataContainer.getOwner(),
                    dataContainer.getActivityLevel(),
                    dataContainer.getHomeAddress(), dataContainer.getSize(), dataContainer.getBreed(),
                    dataContainer.isSterilized(), dataContainer.getPassportNumber());
        } else if (dataContainer.getType().equals("Кот")) {
            counter.addPetCounter();
            return new Cat(counter.getAndAddCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getCommands(), dataContainer.getOwner(), dataContainer.getActivityLevel(),
                    dataContainer.getHomeAddress(), dataContainer.getSize(),
                    dataContainer.getBreed(), dataContainer.getCoatLength(),
                    dataContainer.isSterilized(), dataContainer.getPassportNumber());
        } else if (dataContainer.getType().equals("Хомяк")) {
            counter.addPetCounter();
            return new Hamster(counter.getAndAddCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getCommands(), dataContainer.getOwner(), dataContainer.getActivityLevel(),
                    dataContainer.getHomeAddress(), dataContainer.getSize(), dataContainer.getLength());
        } else if (dataContainer.getType().equals("Верблюд")) {
            counter.addPackAnimalCounter();
            return new Camel(counter.getAndAddCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getCommands(), dataContainer.getPurpose(), dataContainer.getLivingEnvironment(),
                    dataContainer.getBreed(), dataContainer.getSize(), dataContainer.getLoadCapacity());
        } else if (dataContainer.getType().equals("Осёл")) {
            counter.addPackAnimalCounter();
            return new Donkey(counter.getAndAddCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getCommands(), dataContainer.getPurpose(), dataContainer.getLivingEnvironment(),
                    dataContainer.getBreed(), dataContainer.getOwner(), dataContainer.getLoadCapacity());
        }
        else if (dataContainer.getType().equals("Лошадь")) {
            counter.addPackAnimalCounter();
            return new Horse(counter.getAndAddCount(), dataContainer.getName(), dataContainer.getBirthday(),
                    dataContainer.getWeight(), dataContainer.getGender(), dataContainer.getColor(),
                    dataContainer.getTemperament(), dataContainer.getCommands(), dataContainer.getPurpose(), dataContainer.getLivingEnvironment(),
                    dataContainer.getBreed(), dataContainer.getSpeed(),
                    dataContainer.getSize(), dataContainer.getOwner());
        }
        else {
            return null;
        }
    }
}
