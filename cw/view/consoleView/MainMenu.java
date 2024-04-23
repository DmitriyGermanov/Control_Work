package view.consoleView;

import view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new CreateAnimal(consoleUI));
        commandList.add(new ShowAllByBirthDate(consoleUI));
        commandList.add(new ShowAnimalsCounter(consoleUI));
        commandList.add(new AddCommandById(consoleUI));
        commandList.add(new LoadFromFile(consoleUI));
        commandList.add(new Exit(consoleUI));
        commandList.add(new SaveAndExit(consoleUI));
    }

    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append("\n");
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) {
        Command command = commandList.get(choice - 1);
        command.execute();
    }

    public int getSize() {
        return commandList.size();
    }
}
