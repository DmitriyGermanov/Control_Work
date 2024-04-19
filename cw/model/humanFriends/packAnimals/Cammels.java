package model.humanFriends.packAnimals;

import model.humanFriends.Gender;

import java.time.LocalDate;

public class Cammels extends PackAnimals{
    private String size;
    private double loadCapacity;

    public Cammels(int id, String name, LocalDate birthday, double weight, Gender gender, String color,
                   String temperament, String purpose, String livingEnvironment,
                   String breed, String size, double loadCapacity) {
        super(id, name, birthday, weight, gender, color, temperament, purpose, livingEnvironment, breed);
        this.size = size;
        this.loadCapacity = loadCapacity;
    }
}
