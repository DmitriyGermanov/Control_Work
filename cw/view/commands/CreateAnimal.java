package view.commands;

import view.consoleView.ConsoleUI;

public class CreateAnimal extends Command {
    public CreateAnimal(ConsoleUI consoleUI) {
        super("Ввести животное", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().createAnimal();
    }
}
