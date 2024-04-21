package view.consoleView.input.animalInput;

import view.consoleView.input.Input;

public class CamelInput extends PackAnimalsInput {
    public CamelInput(Input input) {
        super("Верблюд", input);
    }

    @Override
    protected void SpecificInput() {
        System.out.println("Введите размер верблюда (строка): ");
        container.setSize(input.dataInput());
        System.out.println("Введите грузоподъемность верблюда в килограммах (число): ");
        container.setLoadCapacity(input.doubleInput());

    }

}
