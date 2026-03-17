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
        terrains = new ArrayList<>();
    }

    public void addTerrain(String terrain) {
        terrains.add(terrain);
    }
    public ArrayList<String> getTerrains() {
        return terrains;
    }

    // More difficult terrains = higher difficulty score
    @Override
    public int calcDifficulty() {
        int difficulty = 1;
        for (String terrain : terrains) {
            if (terrain.equalsIgnoreCase("cobblestone") ||
                terrain.equalsIgnoreCase("steep") ||
                terrain.equalsIgnoreCase("unpaved")) {
                difficulty += 1;
            }
        }
        return Math.min(difficulty, 10);
    }

    @Override
    public Route getRoute(){
        return this;
    }

    @Override
    public int getDifficulty(){
        return calcDifficulty();
    }

} 

