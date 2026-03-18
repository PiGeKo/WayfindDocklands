package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 * subclass of Route
 */
import java.util.ArrayList;
 
public class WalkingRoute extends Route {

    private ArrayList<String> terrains;
    
    //Constructor
    public WalkingRoute(String id, String name) {
        super(id, name);
        terrains = new ArrayList<>();
    }

    //Getters
    public ArrayList<String> getTerrains() {
        return terrains;
    }
    @Override
    public Route getRoute(){
        return this;
    }

    @Override
    public int getDifficulty(){
        return calcDifficulty();
    }
    
    //Methods
    public void addTerrain(String terrain) {
        terrains.add(terrain);
    }
    // Asphalt is easy so at 1, others are more difficult so adds.
    @Override
    public int calcDifficulty() {
        int difficulty = 1;
        for (String terrain : terrains) {
            if (terrain.equals("Cobblestone") ||
                terrain.equals("Steep") ||
                terrain.equals("Unpaved")) {
                difficulty += 1;
            }
        }
        return Math.min(difficulty, 10);
    }
} 

