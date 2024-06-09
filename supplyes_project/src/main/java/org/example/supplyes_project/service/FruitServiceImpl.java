package org.example.supplyes_project.service;


import org.example.supplyes_project.interfaces.FruitService;
import org.example.supplyes_project.models.Fruit;
import org.example.supplyes_project.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public void addFruit(Fruit fruit) {
        fruitRepository.save(fruit);
    }

    public Fruit saveFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit getFruitById(int id) {
        return fruitRepository.findById(id).orElse(null);
    }

    @Override
    public void updateFruit(Fruit fruit) {
        fruitRepository.save(fruit);
   }

    @Override
    public void deleteFruit(int id) {
        fruitRepository.deleteById(id);
    }
}

