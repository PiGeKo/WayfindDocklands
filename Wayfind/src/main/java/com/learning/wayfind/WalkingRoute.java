package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 */
import java.util.ArrayList;
 
public class WalkingRoute extends Route {
 
    private ArrayList<String> terrains;
 
    public WalkingRoute(String id, String name) {
        super(id, name);
    }
 
    @Override
    public int calcDifficulty() {
        return 0;
    }
 
    @Override
    public Route getRoute() {
        return null;
    }
 
    @Override
    public int getDifficulty() {
        return 0;
    }
    
    
}
 
