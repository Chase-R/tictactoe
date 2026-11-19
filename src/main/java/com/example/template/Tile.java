package com.example.template;

public class Tile {
    private int owner;
    private String tileColor;

    public Tile(String color){
        tileColor = color;
        owner = 2;
    }

    public int getOwner() {
        return owner;
    }
    public void setOwner(int owner){
        this.owner = owner;
    }

    public String getTileColor() {
        return tileColor;
    }

    public void setTileColor(String tileColor) {
        this.tileColor = tileColor;
    }
}
