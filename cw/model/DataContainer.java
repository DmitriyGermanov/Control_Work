package model;

import model.humanFriends.animals.Gender;

import java.time.LocalDate;
import java.util.List;

public class DataContainer {
    private String name; //base
    private LocalDate birthday; //base
    private double weight; //base
    private Gender gender; //base
    private String color; //base
    private String temperament; //base
    private List<String> commands; //base

    private String owner; //pet, donkey, horse
    private String activityLevel; //pet
    private String homeAddress; //pet
    private String size; //pet, camel, horse

    private String purpose; //packAnimal
    private String livingEnvironment; //packAnimal
    private String breed; //packAnimal, cat, dog
    private double loadCapacity; //camel, donkey
    private String speed; //horse
    private String coatLength; //cat
    private boolean sterilized; //cat, dog
    private int passportNumber; //cat, dog
    public double length; //hamster

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public void setCommands(String command) {
        commands.add(command);
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

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setCoatLength(String coatLength) {
        this.coatLength = coatLength;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getTemperament() {
        return temperament;
    }

    public List<String> getCommands() {
        return commands;
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

    public String getPurpose() {
        return purpose;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public String getBreed() {
        return breed;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public String getSpeed() {
        return speed;
    }

    public String getCoatLength() {
        return coatLength;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public double getLength() {
        return length;
    }
}
