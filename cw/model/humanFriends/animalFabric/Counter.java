package model.humanFriends.animalFabric;

public class Counter {
    int counter;

    public Counter() {
        counter = 0;
    }

    public int getCount() {
        return ++counter;
    }
}
