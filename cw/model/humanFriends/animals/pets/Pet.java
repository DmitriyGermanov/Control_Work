package model.humanFriends.animals.pets;

import model.humanFriends.animals.Animal;
import model.humanFriends.animals.Gender;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    private String owner;
    private String activityLevel;
    private String homeAddress;
    private String size;

    public Pet(int id, String name, LocalDate birthday, double weight,
               Gender gender, String color, String temperament, String type, String owner,
               String activityLevel, String homeAddress, String size) {
        super(id, name, birthday, weight, gender, color, temperament, type);
        this.owner = owner;
        this.activityLevel = activityLevel;
        this.homeAddress = homeAddress;
        this.size = size;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOwner() {
        return owner;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getSize() {
        return size;
    }

    public Pet(int id) {
        super(id);
    }
}
