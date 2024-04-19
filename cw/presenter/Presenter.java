package presenter;

import model.Service;
import view.View;
import view.consoleView.ConsoleUI;
import model.DataContainer;

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

    public void writeData(String s) {
    }
    public void setAnimalName(String name) {
        service.setAnimalName(name);
    }
}
