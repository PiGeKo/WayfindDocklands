package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 */
public class AccessibleRoute extends Route {

    private boolean hasRamps;

    public AccessibleRoute(String id, String name) {
        super(id, name);
        this.hasRamps = false;
    }

    public boolean isHasRamps(){ 
        return hasRamps;
    }
    public void setHasRamps(boolean h) {
        this.hasRamps = h;
    }

    // Harder if no ramps available
    @Override
    public int calcDifficulty(){
        if (hasRamps) return 3;
        else{
            return 7;
        }
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
