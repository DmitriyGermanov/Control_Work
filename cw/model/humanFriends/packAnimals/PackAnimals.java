package model.humanFriends.packAnimals;

import model.humanFriends.Animals;
import model.humanFriends.Gender;

import java.time.LocalDate;

public abstract class PackAnimals extends Animals {
    private String purpose;
    private String livingEnvironment;
    private String breed;

    public PackAnimals(int id, String name, LocalDate birthday, double weight,
                       Gender gender, String color, String temperament,
                       String purpose, String livingEnvironment, String breed) {
        super(id, name, birthday, weight, gender, color, temperament);
        this.purpose = purpose;
        this.livingEnvironment = livingEnvironment;
        this.breed = breed;
    }
}
