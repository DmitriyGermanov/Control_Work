package model;

import model.humanFriends.AnimalList;
import model.humanFriends.animalFabric.AnimalFabric;
import model.humanFriends.animals.Animal;
import view.consoleView.input.animalInput.DataContainer;


public class Service {
    private final AnimalList<Animal> animalList;
    private AnimalFabric animalFabric;

    public Service() {
        this.animalList = new AnimalList<>();
        this.animalFabric = new AnimalFabric();
    }

    public boolean createAnimal(DataContainer dataContainer) {
        return animalList.add(animalFabric.createAnimal(dataContainer));
    }

    public String showAllByBirthDate() {
        return animalList.showAllByBirthDate();
    }
}
