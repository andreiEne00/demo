package entity;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.ArrayList;

public class Cart {
    private Long id;
    private ArrayList<CartItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }
}
