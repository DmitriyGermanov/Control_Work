package view.consoleView.input.animalInput;

import view.consoleView.input.Input;


public class HamsterInput extends PetInput {

    public HamsterInput(Input input) {
        super("Хомяк", input);
    }


    @Override
    protected void SpecificInput() {
        System.out.println("Введите длину хомяка:");
        container.setLength(input.doubleInput());
    }
}
