package view.commands;

import view.consoleView.ConsoleUI;

public class ShowAllByBirthDate extends Command {
    public ShowAllByBirthDate(ConsoleUI consoleUI) {
        super("Показать все записи по дате рождения", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showAllByBirthDate();
    }
}
