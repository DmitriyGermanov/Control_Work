package view.commands;

import view.consoleView.ConsoleUI;

public class AddCommandById extends Command{
    public AddCommandById(ConsoleUI consoleUI) {
        super("Добавить команды животному по id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addCommandById();
    }
}
