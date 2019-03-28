package com.zemoso.inventorymanagement.controller;

import com.zemoso.inventorymanagement.model.Inventory;
import com.zemoso.inventorymanagement.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @GetMapping("/inventory")
    public List<Inventory> getAllInventories(){
        return inventoryService.getAllInventories();
    }
    @GetMapping("/inventory/{id}")
    public Optional<Inventory> getInventory(@PathVariable long id){
        return inventoryService.getInventory(id);
    }

    @PostMapping("/inventory")
    public void addInventory(@RequestBody Map<String,String> map){
        inventoryService.addInventory(map.get("type"));
    }

    @PutMapping("/inventory/{id}")
    public void editInventory(@PathVariable long id,@RequestBody Map<String, String> updatedInventoryDetails){
        inventoryService.editInventory(id,updatedInventoryDetails);
    }

}
