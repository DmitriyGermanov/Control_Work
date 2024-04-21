package view.consoleView.input.animalInput;

import view.consoleView.input.Input;

public class HorseInput extends PackAnimalsInput {
    public HorseInput(Input input) {
        super("Лошадь", input);
    }

    @Override
    protected void SpecificInput() {
        System.out.println("Введите характеристику скорости лошади (строка): ");
        container.setSpeed(input.dataInput());
        System.out.println("Введите размер лошади (строка): ");
        container.setSize(input.dataInput());
        System.out.println("Введите владельца лошади (строка): ");
        container.setOwner(input.dataInput());
    }

}
