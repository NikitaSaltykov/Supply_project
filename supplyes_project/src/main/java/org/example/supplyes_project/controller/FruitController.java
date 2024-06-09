package org.example.supplyes_project.controller;



import org.example.supplyes_project.interfaces.FruitService;
import org.example.supplyes_project.models.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @GetMapping("/add-fruit")
    public String createFruitForm(Model model){
        model.addAttribute("fruit", new Fruit());
        return "add-fruit";
    }

    @PostMapping("/add-fruit")
    public String createFruit(@ModelAttribute Fruit fruit) {
        fruitService.saveFruit(fruit);
        return "redirect:/fruits";
    }

    @GetMapping
    public String getAllFruits(Model model) {
        List<Fruit> fruits = fruitService.getAllFruits();
        model.addAttribute("fruits", fruits);
        return "fruit-list";
    }

    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable int id) {
        return fruitService.getFruitById(id);
    }

    @GetMapping("/update-fruit/{id}")
    public String getUpdateFruitView(Model model, @PathVariable Long id){
        Fruit fruit = new Fruit();
        fruit.setId(id);
        model.addAttribute("fruit", fruit);
        return "update-fruit";
    }

    @PostMapping("/update-fruit")
    public String updateFruit(@ModelAttribute Fruit fruit) {
        fruitService.updateFruit(fruit);
        return "redirect:/fruits";
    }

    @GetMapping("/delete-fruit/{id}")
    public String deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
        return "redirect:/fruits";
    }
}
