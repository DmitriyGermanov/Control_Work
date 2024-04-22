package view.commands;

import view.consoleView.ConsoleUI;

public class SaveAndExit extends Command{
    public SaveAndExit(ConsoleUI consoleUI) {
        super("Сохранить и выйти", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().saveAndExit();
    }
}
