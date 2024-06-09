package org.example.supplyes_project.restcontroller;

import org.example.supplyes_project.interfaces.FruitService;
import org.example.supplyes_project.models.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fruits")
public class FruitRestController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/")
    public void addFruit(@RequestBody Fruit fruit) {
        fruitService.addFruit(fruit);
    }

    @GetMapping("/")
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable int id) {
        return fruitService.getFruitById(id);
    }

    @PutMapping("/")
    public void updateFruit(@RequestBody Fruit fruit) {
        fruitService.updateFruit(fruit);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
    }
}
