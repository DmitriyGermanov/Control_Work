package humanFriends.pets;

import humanFriends.Gender;

import java.time.LocalDate;

public class Hamsters extends Pets{
    public double length;

    public Hamsters(int id, String name, LocalDate birthday, double weight, Gender gender,
                    String color, String temperament, String owner, String activityLevel,
                    String homeAddress, String size, double length) {
        super(id, name, birthday, weight, gender, color, temperament, owner, activityLevel, homeAddress, size);
        this.length = length;
    }
}
