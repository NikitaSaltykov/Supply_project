package org.example.supplyes_project.restcontroller;


import org.example.supplyes_project.interfaces.DeliveryService;
import org.example.supplyes_project.interfaces.FruitService;
import org.example.supplyes_project.interfaces.SupplierService;
import org.example.supplyes_project.models.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryRestController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/")
    public void addDelivery(@RequestBody Delivery delivery) {
        deliveryService.addDelivery(delivery);
    }

    @GetMapping("/")
    public List<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

    @GetMapping("/{id}")
    public Delivery getDeliveryById(@PathVariable int id) {
        return deliveryService.getDeliveryById(id);
    }

    @PutMapping("/")
    public void updateDelivery(@RequestBody Delivery delivery) {
        deliveryService.updateDelivery(delivery);
    }

    @DeleteMapping("/{id}")
    public void deleteDelivery(@PathVariable int id) {
        deliveryService.deleteDelivery(id);
    }
}
