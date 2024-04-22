package view.commands;

import view.consoleView.ConsoleUI;

public class ShowAnimalsCounter extends Command{
    public ShowAnimalsCounter(ConsoleUI consoleUI) {
        super("Показать кол-во животных по типу", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showAnimalsCounter();

    }
}
