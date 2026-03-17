package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 */
public class Street {
 
    private String name;
    private int streetID;
 
    public Street(String name, int streetID) {
        this.name = name;
        this.streetID = streetID;
}
 
    public String getName() {
        return name;
    }
    
    
    public int getID() {
        return streetID;
    }
    @Override
    public String toString() {
        return streetID + " - " + name;
    }
}

