package org.example.supplyes_project.interfaces;

import org.example.supplyes_project.models.Fruit;

import java.util.List;

public interface FruitService {
    void addFruit(Fruit fruit);
    List<Fruit> getAllFruits();
    Fruit getFruitById(int id);
    void updateFruit(Fruit fruit);
    Fruit saveFruit(Fruit fruit);
    void deleteFruit(int id);
}
