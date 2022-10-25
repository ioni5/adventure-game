package io.github.ioni5;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<String> items;

    private boolean isDead;

    public Player() {
        items = new ArrayList<>();
    }

    public boolean hasItem(String item) {
        return items.contains(item);
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void die() {
        isDead = true;
    }

    public boolean isDead() {
        return isDead;
    }
    
}
