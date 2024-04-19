package model.humanFriends.animals.packAnimals;

import model.humanFriends.animals.Gender;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    private String owner;
    private double loadCapacity;

    public Donkey(int id, String name, LocalDate birthday, double weight, Gender gender, String color,
                  String temperament, String purpose, String livingEnvironment,
                  String breed, String owner, double loadCapacity) {
        super(id, name, birthday, weight, gender, color, temperament, "Donkey", purpose, livingEnvironment, breed);
        this.owner = owner;
        this.loadCapacity = loadCapacity;
    }

    public String getOwner() {
        return owner;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
