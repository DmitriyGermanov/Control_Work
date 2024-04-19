package model.humanFriends.packAnimals;

import model.humanFriends.Gender;

import java.time.LocalDate;

public class Horses extends PackAnimals{
    private String speed;
    private String size;
    private String owner;

    public Horses(int id, String name, LocalDate birthday, double weight, Gender gender, String color,
                  String temperament, String purpose, String livingEnvironment,
                  String breed, String speed, String size, String owner) {
        super(id, name, birthday, weight, gender, color, temperament, purpose, livingEnvironment, breed);
        this.speed = speed;
        this.size = size;
        this.owner = owner;
    }
}
