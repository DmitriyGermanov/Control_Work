package view.commands;

import view.consoleView.ConsoleUI;

public class Exit extends Command {

    public Exit(ConsoleUI consoleUI) {
        super("Выйти без сохранения", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().setWork();
    }
}