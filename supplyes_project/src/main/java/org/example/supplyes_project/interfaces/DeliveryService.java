package org.example.supplyes_project.interfaces;

import org.example.supplyes_project.models.Delivery;

import java.util.List;

public interface DeliveryService {
    void addDelivery(Delivery delivery);
    List<Delivery> getAllDeliveries();
    Delivery getDeliveryById(int id);
    void updateDelivery(Delivery delivery);
    void deleteDelivery(int id);
    Delivery saveDelivery(Delivery delivery);
}
