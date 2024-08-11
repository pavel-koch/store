package com.example.store.service;

import com.example.store.model.Item;

import java.util.List;

public interface StoreService {
    void add(List<Long> itemIds);
    List<Item> get();
}
