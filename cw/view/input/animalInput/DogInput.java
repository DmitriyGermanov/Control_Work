package view.input.animalInput;

import view.input.Input;


public class DogInput extends PetInput {
    public DogInput(Input input) {
        super("Собака", input);
    }

    @Override
    protected void SpecificInput() {
        System.out.println("Введите породу животного (текст):");
        container.setBreed(input.dataInput());
        System.out.println("Введите 1, если животное стерилизовано, 0, если животное не стерилизовано");
        container.setSterilized(input.rangeIntInput(0, 1) == 1);
        System.out.println("Введите номер паспорта животного (число):");
        container.setPassportNumber(input.intInput());
    }
}
