package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 */
public class AccessibleRoute extends Route {
 
    private boolean hasRamps;
    //something else?
 
    public AccessibleRoute(String id, String name) {
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
