package model.humanFriends;

import model.humanFriends.animals.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalList<T extends Animal> implements Serializable {
    private final List<T> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "animals=" + animals +
                '}';
    }

    public boolean add(T animal) {
        if (animal == null) {
            return false;
        } else {
            this.animals.add(animal);
        }
        return true;
    }

    public String showAllByBirthDate() {
        List<T> sorted = animals;
        sorted.sort((animal1, animal2) -> animal1.getBirthday().compareTo(animal2.getBirthday()));
        StringBuilder sb = new StringBuilder();
        if (animals.isEmpty()) {
            return sb.append("Добавленные животные отсутствуют").toString();
        } else {
            boolean flag1;
            sb.append("Все добавленные животные:\n");
            sb.append(String.format("%-5s %-15s %-15s %-10s %-30s", "ID", "Имя животного", "Дата рождения",
                    "Тип", "Команды"));
            for (Animal animal : sorted) {
                sb.append(String.format("\n%-5s %-15s %-15s %-10s %-30s", animal.getId(), animal.getName(),
                        animal.getBirthday(), animal.getType(), animal.getCommands()));
            }
        }
        return sb.toString();
    }

    public T searchById(Integer id) {
        List<T> sorted = animals;
        sorted.sort((animal1, animal2) -> animal1.getId() - animal2.getId());
        int finalId = Collections.binarySearch(sorted, new Animal(id),
                (animal1, animal2) -> animal1.getId() - animal2.getId());
        if (finalId >= 0) {
            return animals.get(finalId);
        } else {
            return null;
        }
    }
}
