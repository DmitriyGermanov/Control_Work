package humanFriends.pets;

import humanFriends.Gender;

import java.time.LocalDate;

public class Cats extends Pets{
    private String breed;
    private String coatLength;
    private boolean sterilized;
    private int passportNumber;

    public Cats(int id, String name, LocalDate birthday, double weight,
                Gender gender, String color, String temperament, String owner, String activityLevel,
                String homeAddress, String size, String breed, String coatLength,
                boolean sterilized, int passportNumber) {
        super(id, name, birthday, weight, gender, color, temperament, owner, activityLevel, homeAddress, size);
        this.breed = breed;
        this.coatLength = coatLength;
        this.sterilized = sterilized;
        this.passportNumber = passportNumber;
    }
}
