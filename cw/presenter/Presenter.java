package presenter;

import model.service.Service;
import view.View;
import view.consoleView.ConsoleUI;
import view.input.animalInput.DataContainer;

import java.util.List;

public class Presenter {
    Service service;
    View view;


    public Presenter(ConsoleUI view) {
        this.service = new Service();

        this.view = view;
        view.setPresenter(this);
    }

    public void start() {
        view.start();
    }

    public boolean createAnimal(DataContainer data) {
        return service.createAnimal(data);
    }

    public String showAllByBirthDate() {
       return service.showAllByBirthDate();
    }

    public boolean save(String filename) {
        return service.save(filename);
    }

    public boolean load(String file) {
        return service.load(file);
    }

    public String showAnimalsCounter() {
        return service.showAnimalsCounter();
    }

    public boolean addCommandById(Integer id, List<String> commands) {
        return service.addCommandById(id, commands);
    }
}
