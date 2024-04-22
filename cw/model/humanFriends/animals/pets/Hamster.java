package model.humanFriends.animals.pets;

import view.consoleView.input.animalInput.Gender;

import java.time.LocalDate;
import java.util.List;

public class Hamster extends Pet {
    public double length;

    public Hamster(int id, String name, LocalDate birthday, double weight, Gender gender,
                   String color, String temperament, List<String> commands,
                   String owner, String activityLevel, String homeAddress, String size, double length) {
        super(id, name, birthday, weight, gender, color, temperament, "Хомяк", commands, owner,
                activityLevel, homeAddress, size);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
