package view.commands;

import view.consoleView.ConsoleUI;

public class LoadFromFile extends Command {
    public LoadFromFile(ConsoleUI consoleUI) {
        super("Загрузка из файла", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().loadFromFile();
    }
}
