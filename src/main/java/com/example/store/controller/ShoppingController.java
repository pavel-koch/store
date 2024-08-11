package com.example.store.controller;

import com.example.store.model.Item;
import com.example.store.service.StoreService;
import com.example.store.service.StoreServiceImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")

public class ShoppingController {
    private final StoreService service;

    public ShoppingController(StoreService service) {
        this.service = service;
    }


    @GetMapping("/add")
    public void add(@RequestParam("itemIds") List<Long> itemIds) {
        service.add(itemIds);
    }


    @GetMapping("/get")
    public List<Item> get() {
        return service.get();

    }
}
