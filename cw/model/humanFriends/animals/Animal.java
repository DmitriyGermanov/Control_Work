package model.humanFriends.animals;

import view.consoleView.input.animalInput.Gender;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Serializable {
    private final int id;
    private String name;
    private LocalDate birthday;
    private double weight;
    private Gender gender;
    private String color;
    private String temperament;
    private List<String> commands;
    private String type;

    public Animal(int id, String name, LocalDate birthday, double weight,
                  Gender gender, String color, String temperament, String type, List<String> commands) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.gender = gender;
        this.color = color;
        this.temperament = temperament;
        this.commands = commands;
        this.type = type;
    }

    public Animal(int id) {
        this.id = id;
        this.commands = new ArrayList<>();
    }

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

    public void setCommand(String command) {
        this.commands.add(command);
    }

    public int getId() {
        return id;
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

    public String getCommands() {
        if (commands.isEmpty()) {
            return "Команды не заданы!";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String command : commands) {
                sb.append(command).append(", ");
            }
            sb.setLength(sb.length() - 2);
            return sb.toString();
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ID животного: " + id + "\nИмя животного:" + name + "\n Дата рождения:" + birthday +
                "\nТип животного:" + type;
    }


}
