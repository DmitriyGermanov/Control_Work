package model;

import model.humanFriends.AnimalList;
import model.humanFriends.animalFabric.AnimalFabric;
import model.humanFriends.animals.Animal;
import model.writer.FileHandler;
import model.writer.Writable;
import view.consoleView.input.animalInput.DataContainer;


public class Service {
    private AnimalList<Animal> animalList;
    private final AnimalFabric animalFabric;
    private final Writable fileHandler;

    public Service() {
        this.animalList = new AnimalList<>();
        this.animalFabric = new AnimalFabric();
        this.fileHandler = new FileHandler();
    }

    public boolean createAnimal(DataContainer dataContainer) {
        return animalList.add(animalFabric.createAnimal(dataContainer));
    }

    public String showAllByBirthDate() {
        return animalList.showAllByBirthDate();
    }

    public boolean save(String filename) {
        if (fileHandler.writeObject(animalList, filename)) {
            fileHandler.close();
            return true;
        } else {
            return false;
        }
    }

    public boolean load(String file) {
        try {
            animalList = (AnimalList<Animal>) this.fileHandler.readObject(file);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
