package model.humanFriends.animals.pets;

import view.consoleView.input.animalInput.Gender;

import java.time.LocalDate;

public class Cat extends Pet {
    private String breed;
    private String coatLength;
    private boolean sterilized;
    private int passportNumber;

    public Cat(int id, String name, LocalDate birthday, double weight,
               Gender gender, String color, String temperament, String owner, String activityLevel,
               String homeAddress, String size, String breed, String coatLength,
               boolean sterilized, int passportNumber) {
        super(id, name, birthday, weight, gender, color, temperament, "Cat", owner, activityLevel, homeAddress, size);
        this.breed = breed;
        this.coatLength = coatLength;
        this.sterilized = sterilized;
        this.passportNumber = passportNumber;
    }


    public String getBreed() {
        return breed;
    }

    public String getCoatLength() {
        return coatLength;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCoatLength(String coatLength) {
        this.coatLength = coatLength;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Cat(int id) {
        super(id);
    }
}
