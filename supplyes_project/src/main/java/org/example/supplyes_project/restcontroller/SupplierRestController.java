package org.example.supplyes_project.restcontroller;

import org.example.supplyes_project.interfaces.SupplierService;
import org.example.supplyes_project.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierRestController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/")
    public void addSupplier(@RequestBody Supplier supplier) {
        supplierService.addSupplier(supplier);
    }

    @GetMapping("/")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable int id) {
        return supplierService.getSupplierById(id);
    }

    @PutMapping("/")
    public void updateSupplier(@RequestBody Supplier supplier) {
        supplierService.updateSupplier(supplier);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable int id) {
        supplierService.deleteSupplier(id);

    }
}
