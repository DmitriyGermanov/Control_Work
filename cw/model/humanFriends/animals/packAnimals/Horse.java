package model.humanFriends.animals.packAnimals;

import model.humanFriends.animals.Gender;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    private String speed;
    private String size;
    private String owner;

    public Horse(int id, String name, LocalDate birthday, double weight, Gender gender, String color,
                 String temperament, String purpose, String livingEnvironment,
                 String breed, String speed, String size, String owner) {
        super(id, name, birthday, weight, gender, color, temperament, "Horse", purpose, livingEnvironment, breed);
        this.speed = speed;
        this.size = size;
        this.owner = owner;
    }

    public String getSpeed() {
        return speed;
    }

    public String getSize() {
        return size;
    }

    public String getOwner() {
        return owner;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
