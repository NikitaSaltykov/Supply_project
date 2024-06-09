package org.example.supplyes_project.interfaces;

import org.example.supplyes_project.models.Supplier;

import java.util.List;

public interface SupplierService {
    void addSupplier(Supplier supplier);
    List<Supplier> getAllSuppliers();
    Supplier getSupplierById(int id);
    void updateSupplier(Supplier supplier);
    void deleteSupplier(int id);
    Supplier saveSupplier(Supplier supplier);
}
