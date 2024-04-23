package model;

import model.humanFriends.AnimalList;
import model.humanFriends.animalFabric.AnimalFabric;
import model.humanFriends.animals.Animal;
import model.writer.FileHandler;
import model.writer.Writable;
import view.consoleView.input.animalInput.DataContainer;

import java.util.List;


public class Service {
    private AnimalList<Animal> animalList;
    private final AnimalFabric animalFabric;
    private final Writable fileHandler;
    private Counter counter;

    public Service() {
        this.counter = new Counter();
        this.animalList = new AnimalList<>();
        this.animalFabric = new AnimalFabric(this.counter);
        this.fileHandler = new FileHandler();

    }

    public boolean createAnimal(DataContainer dataContainer) {
        return animalList.add(animalFabric.createAnimal(dataContainer));
    }

    public String showAllByBirthDate() {
        return animalList.showAllByBirthDate();
    }

    public boolean save(String filename) {
        if (fileHandler.writeObject(animalList, filename) &&
                fileHandler.writeObject(counter, "counter_" + filename)) {
            fileHandler.close();
            return true;
        } else {
            return false;
        }
    }

    public boolean load(String file) {
        try {
            animalList = (AnimalList<Animal>) this.fileHandler.readObject(file);
            counter = (Counter) this.fileHandler.readObject("counter_" + file);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String showAnimalsCounter() {
        StringBuilder builder = new StringBuilder();
        builder.append("Всего животных: ").append(counter.getCounter()).append("\n");
        builder.append("Питомцы: ").append(counter.getPetCount()).append("\n");
        builder.append("Вьючные животные: ").append(counter.getPackAnimalCounter());
        return builder.toString();
    }

    public boolean addCommandById(Integer id, List<String> command) {
        Animal animal = animalList.searchById(id);
        if (animal != null && animal.setCommands(command)) {
            return true;
        } else {
            return false;
        }
    }
}
