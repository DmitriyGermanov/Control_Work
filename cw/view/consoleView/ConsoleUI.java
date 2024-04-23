package view.consoleView;

import presenter.Presenter;
import view.View;
import view.input.ConsoleInput;
import view.input.Input;
import view.input.animalInput.*;

import java.util.ArrayList;

public class ConsoleUI implements View {
    private boolean work;
    private final MainMenu menu;
    private final Input input;
    private Presenter presenter;
    private ArrayList<AnimalInput> animalInputs;

    public ConsoleUI() {
        this.work = true;
        menu = new MainMenu(this);
        input = new ConsoleInput();
        animalInputs = new ArrayList<>();
        animalInputs.add(new DogInput(input));
        animalInputs.add(new CatInput(input));
        animalInputs.add(new HamsterInput(input));
        animalInputs.add(new HorseInput(input));
        animalInputs.add(new CamelInput(input));
        animalInputs.add(new DonkeyInput(input));

    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        System.out.println("Здравствуйте!\nВведите в консоль пункт меню и нажмите Enter");
        while (work) {
            printMenu();
            execute();
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    private void execute() {
        try {
            menu.execute(input.intInput());
        } catch (NumberFormatException e) {
            System.out.println("Введите пункт меню в виде цифры от 1 до " + menu.getSize());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Введите корректный пункт меню от 1 до " + menu.getSize());
        }
    }

    public void setWork() {
        this.work = false;
    }

    public void createAnimal() {
        System.out.println("Выберите тип животного от 1 до " + animalInputs.size());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < animalInputs.size(); i++) {
            stringBuilder.append("\n");
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(animalInputs.get(i).getType());
        }
        System.out.println(stringBuilder);
        if (presenter.createAnimal(animalInputs.get(input.intInput() - 1).inputAnimal())) {
            System.out.println("Животное успешно добавлено");
        } else {
            System.out.println("Ошибка! Животное не добавлено");
        }
    }

    public void showAllByBirthDate() {
        System.out.println(presenter.showAllByBirthDate());
    }

    public void saveAndExit() {
        if (presenter.save("data.txt")) {
            System.out.println("Данные успешно сохранены");
            setWork();
        } else {
            System.out.println("Ошибка! Данные не сохранены, попробуйте выйти без сохранения изменений");
        }

    }

    public void loadFromFile() {
        if (presenter.load("data.txt")) {
            System.out.println("Данные успешно загружены");
        } else {
            System.out.println("Ошибка! Данные не загружены");

        }
    }

    public void showAnimalsCounter() {
        System.out.println(presenter.showAnimalsCounter());
    }

    public void addCommandById() {
        System.out.println("Введите ID животного");
        int id = input.intInput();
        System.out.println("Введите команды для добавления через запятую:");
        if (presenter.addCommandById(id, input.dataInputList())) {
            System.out.println("Команды успешно добавлены");
        } else {
            System.out.println("Ошибка! Команды не добавлены");
        }
    }
}
