package com.learning.wayfind;
/**
 *
 * Piotr Konkol
 * 2026
 * Abstract class for the routes
 * Uses routeImplementation for making sure there's getRoute, getDifficulty, getRating in all routes.
 */
public abstract class Route implements RouteImplementation {
 
    private String id;
    private String name;
    private int rating;
    private String note;
 
    //Constructor
    public Route(String id, String name) {
        this.id = id;
        this.name = name;
        this.rating = 0;
        this.note = "";
    }
    
    //Getters
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String getNote() {
        return note;
    }
    
    
    @Override
    public Route getRoute() {
        return this;
    }
    
    @Override
    public int getDifficulty() {
        return calcDifficulty();
    }
    
    //Setters
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setNote(String note) {
        this.note = note;
    }
   //each own difficulty calc
    public abstract int calcDifficulty();
}

