package view.input.animalInput;

import view.input.Input;

public abstract class PetInput extends AnimalInput {

    public PetInput(String type, Input input) {
        super(type, input);
    }

    @Override
    protected void AdditionalInput() {
        System.out.println("Введите уровень активности животного:");
        container.setActivityLevel(input.dataInput());
        System.out.println("Введите домашний адрес животного:");
        container.setHomeAddress(input.dataInput());
        System.out.println("Введите размер животного (строка):");
        container.setSize(input.dataInput());
        SpecificInput();
    }

    protected abstract void SpecificInput();


}
