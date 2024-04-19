package model.humanFriends;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animals {
    private int id;
    private String name;
    private LocalDate birthday;
    private double weight;
    private Gender gender;
    private String color;
    private String temperament;
    private List<String> commands;

    public Animals(int id, String name, LocalDate birthday, double weight,
                   Gender gender, String color, String temperament) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.gender = gender;
        this.color = color;
        this.temperament = temperament;
        this.commands = new ArrayList<>();
    }


}
