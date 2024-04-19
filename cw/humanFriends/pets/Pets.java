package humanFriends.pets;

import humanFriends.Animals;
import humanFriends.Gender;

import java.time.LocalDate;

public abstract class Pets extends Animals {
    private String owner;
    private String activityLevel;
    private String homeAddress;
    private String size;

    public Pets(int id, String name, LocalDate birthday, double weight,
                Gender gender, String color, String temperament, String owner,
                String activityLevel, String homeAddress, String size) {
        super(id, name, birthday, weight, gender, color, temperament);
        this.owner = owner;
        this.activityLevel = activityLevel;
        this.homeAddress = homeAddress;
        this.size = size;
    }
}
