package view.input.animalInput;

import view.input.Input;

public class DonkeyInput extends PackAnimalsInput{
    public DonkeyInput(Input input) {
        super("Осёл", input);
    }

    @Override
    protected void SpecificInput() {
        System.out.println("Введите владельца осла (строка): ");
        container.setOwner(input.dataInput());
        System.out.println("Введите грузоподъемность осла (число): ");
        container.setLoadCapacity(input.doubleInput());
            }
}
