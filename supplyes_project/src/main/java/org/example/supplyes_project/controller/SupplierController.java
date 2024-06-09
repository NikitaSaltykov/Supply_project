package org.example.supplyes_project.controller;


import org.example.supplyes_project.interfaces.SupplierService;
import org.example.supplyes_project.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public String getAllSuppliers(Model model) {
        List<Supplier> suppliers = supplierService.getAllSuppliers();
        model.addAttribute("suppliers", suppliers);
        return "supplier-list";
    }

    @GetMapping("/add-supplier")
    public String createSupplierForm(Model model) {
        model.addAttribute("supplier", new Supplier());
        return "add-supplier";
    }

    @PostMapping("/add-supplier")
    public String saveSupplier(@ModelAttribute Supplier supplier) {
        supplierService.saveSupplier(supplier);
        return "redirect:/suppliers";
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable int id) {
        return supplierService.getSupplierById(id);
    }

    @GetMapping("/update-supplier/{id}")
    public String getUpdateSupplierView(Model model, @PathVariable Long id) {
        Supplier supplier = new Supplier();
        supplier.setId(id);
        model.addAttribute("supplier", supplier);
        return "update-supplier";
    }

    @PostMapping("/update-supplier")
    public String updateSupplier(@ModelAttribute Supplier supplier) {
        supplierService.updateSupplier(supplier);
        return "redirect:/suppliers";
    }

    @GetMapping("/delete-supplier/{id}")
    public String deleteSupplier(@PathVariable int id) {
        supplierService.deleteSupplier(id);
        return "redirect:/suppliers";
    }

}
