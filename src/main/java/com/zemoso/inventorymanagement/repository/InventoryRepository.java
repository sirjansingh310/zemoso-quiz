package com.zemoso.inventorymanagement.repository;

import com.zemoso.inventorymanagement.model.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InventoryRepository extends CrudRepository<Inventory,Long> {

    List<Inventory> findAll();
}
