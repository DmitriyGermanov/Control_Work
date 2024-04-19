package model.humanFriends.packAnimals;

import model.humanFriends.Gender;

import java.time.LocalDate;

public class Donkeys extends PackAnimals{
    private String owner;
    private double loadCapacity;

    public Donkeys(int id, String name, LocalDate birthday, double weight, Gender gender, String color,
                   String temperament, String purpose, String livingEnvironment,
                   String breed, String owner, double loadCapacity) {
        super(id, name, birthday, weight, gender, color, temperament, purpose, livingEnvironment, breed);
        this.owner = owner;
        this.loadCapacity = loadCapacity;
    }
}
