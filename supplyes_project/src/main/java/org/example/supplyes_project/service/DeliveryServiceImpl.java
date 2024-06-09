package org.example.supplyes_project.service;

import org.example.supplyes_project.interfaces.DeliveryService;
import org.example.supplyes_project.models.Delivery;
import org.example.supplyes_project.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public void addDelivery(Delivery delivery) {
        deliveryRepository.save(delivery);
    }

    public Delivery saveDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }
    @Override
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery getDeliveryById(int id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    @Override
    public void updateDelivery(Delivery delivery) {
        deliveryRepository.save(delivery);
    }

    @Override
    public void deleteDelivery(int id) {
        deliveryRepository.deleteById(id);
    }

}
