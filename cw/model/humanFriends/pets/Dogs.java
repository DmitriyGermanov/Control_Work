package model.humanFriends.pets;

import model.humanFriends.Gender;

import java.time.LocalDate;

public class Dogs extends Pets{
    private String breed;
    private boolean sterilized;
    private int passportNumber;

    public Dogs(int id, String name, LocalDate birthday, double weight, Gender gender,
                String color, String temperament, String owner, String activityLevel,
                String homeAddress, String size, String breed, boolean sterilized, int passportNumber) {
        super(id, name, birthday, weight, gender, color, temperament, owner, activityLevel, homeAddress, size);
        this.sterilized = sterilized;
        this.passportNumber = passportNumber;
    }
}
