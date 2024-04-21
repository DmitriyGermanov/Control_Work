package view.consoleView.input.animalInput;

import view.consoleView.input.Input;

public abstract class PackAnimalsInput extends AnimalInput{

        public PackAnimalsInput(String type, Input input) {
            super(type, input);
        }

        @Override
        protected void AdditionalInput() {
            System.out.println("Введиите назначение животного (строка):");
            container.setPurpose(input.dataInput());
            System.out.println("Введите среду обитания животного (строка):");
            container.setLivingEnvironment(input.dataInput());
            System.out.println("Введите породу животного (строка):");
            container.setBreed(input.dataInput());
            SpecificInput();
        }

        protected abstract void SpecificInput();


    }
