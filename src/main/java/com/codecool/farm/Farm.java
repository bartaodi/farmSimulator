package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> animalsStatus = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            animalsStatus.add("There is a " + animals.get(i).getSize() + " sized " + animals.get(i).getName() + " in the farm.");
        }
        return animalsStatus;
    }

}
