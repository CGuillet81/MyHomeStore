package com.cursan.homeshop;

import java.util.Map;

public class Bill {
    private final Client client;
    private final Map<Product, Integer> products;

    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }

    public Bill(Client client, Map<Product, Integer> products) {
        this.client = client;
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
