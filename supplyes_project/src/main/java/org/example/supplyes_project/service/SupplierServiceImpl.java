package org.example.supplyes_project.service;

import org.example.supplyes_project.interfaces.SupplierService;
import org.example.supplyes_project.models.Supplier;
import org.example.supplyes_project.repository.SuplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SuplierRepository supplierRepository;

    @Override
    public void addSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    public Supplier saveSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier getSupplierById(int id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public void deleteSupplier(int id) {
        supplierRepository.deleteById(id);
    }

}
