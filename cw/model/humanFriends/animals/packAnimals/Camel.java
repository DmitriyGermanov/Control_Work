package model.humanFriends.animals.packAnimals;

import model.humanFriends.animals.Gender;

import java.time.LocalDate;

public class Camel extends PackAnimal {
    private String size;
    private double loadCapacity;

    public Camel(int id, String name, LocalDate birthday, double weight, Gender gender, String color,
                 String temperament, String purpose, String livingEnvironment,
                 String breed, String size, double loadCapacity) {
        super(id, name, birthday, weight, gender, color, temperament,
                "Camel", purpose, livingEnvironment, breed);
        this.size = size;
        this.loadCapacity = loadCapacity;
    }

    public String getSize() {
        return size;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}
