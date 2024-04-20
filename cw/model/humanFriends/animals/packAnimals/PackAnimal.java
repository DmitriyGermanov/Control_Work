package model.humanFriends.animals.packAnimals;

import model.humanFriends.animals.Animal;
import view.consoleView.input.animalInput.Gender;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    private String purpose;
    private String livingEnvironment;
    private String breed;

    public PackAnimal(int id, String name, LocalDate birthday, double weight,
                      Gender gender, String color, String temperament, String type,
                      String purpose, String livingEnvironment, String breed) {
        super(id, name, birthday, weight, gender, color, temperament, type);
        this.purpose = purpose;
        this.livingEnvironment = livingEnvironment;
        this.breed = breed;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public String getBreed() {
        return breed;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
