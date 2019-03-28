package com.zemoso.inventorymanagement.service;

import com.zemoso.inventorymanagement.model.Employee;
import com.zemoso.inventorymanagement.model.Inventory;
import com.zemoso.inventorymanagement.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventories(){
        return inventoryRepository.findAll();
    }

    public Optional<Inventory> getInventory(long id){
        return inventoryRepository.findById(id);
    }

    public void addInventory(String type){
        Inventory inventory = new Inventory();
        inventory.setType(type);
        inventoryRepository.save(inventory);
    }

    public void editInventory(Long id, Map<String, String> updatedInventoryDetails){
        Inventory inventory = new Inventory();
        inventory.setId(id);
        inventory.setType(updatedInventoryDetails.get("type"));
        Employee employee = new Employee();
        employee.setId(Integer.parseInt(updatedInventoryDetails.get("employee_id")));
        inventory.setEmployee(employee);
        inventoryRepository.save(inventory);
    }
}
