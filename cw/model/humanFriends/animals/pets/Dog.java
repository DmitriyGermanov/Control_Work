package model.humanFriends.animals.pets;

import model.humanFriends.animals.Gender;

import java.time.LocalDate;

public class Dog extends Pet {
    private String breed;
    private boolean sterilized;
    private int passportNumber;

    public Dog(int id, String name, LocalDate birthday, double weight, Gender gender,
               String color, String temperament, String owner, String activityLevel,
               String homeAddress, String size, String breed, boolean sterilized, int passportNumber) {
        super(id, name, birthday, weight, gender, color, temperament, "Dog", owner, activityLevel, homeAddress, size);
        this.sterilized = sterilized;
        this.passportNumber = passportNumber;
    }

    public Dog() {
        super();
    }

    public String getBreed() {
        return breed;
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

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Dog(int id) {
        super(id);
    }
}
