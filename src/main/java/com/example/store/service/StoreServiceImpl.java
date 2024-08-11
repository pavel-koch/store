package com.example.store.service;

import com.example.store.Basket;
import com.example.store.model.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Long> itemIds) {
        basket.addAll(itemIds.stream()
                .map(Item::new)
                .toList());
    }

    public List<Item> get() {
        return basket.getAll();
    }
}
