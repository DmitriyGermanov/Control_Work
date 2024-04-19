package view.consoleView.input.animalInput;

import view.consoleView.input.Input;


public abstract class AnimalInput {
    private String description;
    private Input input;
    private DataContainer dataContainer;

    public AnimalInput() {
        this.dataContainer = new DataContainer();
    }

    public abstract void inputAnimal();
}
