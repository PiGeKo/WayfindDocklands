package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 * Mainly used by the Hashmap in MapGUI and the LinkedList in RouteManager
 */
public class Street {
 
    private String name;
    private int streetID;
    
    //Constructor
    public Street(String name, int streetID) {
        this.name = name;
        this.streetID = streetID;
}
    //Getters
    public String getName() {
        return name;
    }
    
    public int getID() {
        return streetID;
    }
    
    //Method
    @Override
    public String toString() {
        return streetID + " - " + name;
    }
}

