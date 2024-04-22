package model;

import java.io.Serializable;

public class Counter implements Serializable {
    int counter;
    int petCounter;
    int packAnimalCounter;

    public Counter() {
        counter = 0;
        petCounter = 0;
        packAnimalCounter = 0;
    }

    public int getAndAddCount() {
        return ++counter;}

    public int getCounter() {
        return counter;
    }

    public int getPetCount() {
        return petCounter;
    }

    public void addPetCounter(){
        petCounter++;
    }
    public void addPackAnimalCounter(){
        packAnimalCounter++;
    }

    public int getPackAnimalCounter() {
        return packAnimalCounter;
    }
}
