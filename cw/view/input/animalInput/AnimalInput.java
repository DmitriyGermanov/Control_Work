package view.input.animalInput;

import view.input.Input;

public abstract class AnimalInput {
    private final String type;
    protected Input input;
    protected DataContainer container;


    public AnimalInput(String type, Input input) {
        this.type = type;
        this.input = input;
        container = new DataContainer();
        container.setType(type);
    }

    public String getType() {
        return type;
    }

    public DataContainer inputAnimal() {
        System.out.println("Введите имя животного:");
        container.setName(input.dataInput());
        System.out.println("Введите дату рождения животного в формате год-месяц-день: (1990-09-10):");
        container.setBirthday(input.dateInput());
        System.out.println("Введите вес животного (число):");
        container.setWeight(input.doubleInput());
        System.out.println("Выберите пол животного");
        System.out.println("Выберите пол: 1. Самец, 2. Самка");
        switch (input.rangeIntInput(1, 2)) {
            case 1:
                container.setGender(Gender.Male);
                break;
            case 2:
                container.setGender(Gender.Female);
                break;
        }
        ;
        System.out.println("Введите цвет животного:");
        container.setColor(input.dataInput());
        System.out.println("Введите характер животного:");
        container.setTemperament(input.dataInput());
        System.out.println("Введите команды, которые умеет животное через запятую");
        container.setCommands(input.dataInputList());
        AdditionalInput();
        return container;
    }

    protected abstract void AdditionalInput();

    @Override
    public String toString() {
        return type;
    }
}
