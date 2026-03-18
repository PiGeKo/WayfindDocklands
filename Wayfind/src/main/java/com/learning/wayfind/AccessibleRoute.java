package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 * subclass of Route
 */
public class AccessibleRoute extends Route {

    private boolean hasRamps;
    
    //Constructor
    public AccessibleRoute(String id, String name) {
        super(id, name);
        //Default false
        this.hasRamps = false;
    }
    //Getters 
    @Override
    public Route getRoute(){ 
        return this;
    }

    @Override
    public int getDifficulty(){ 
        return calcDifficulty(); 
    }
    
    public boolean HasRamps(){ 
        return hasRamps;
    }
    //Setter
    public void setHasRamps(boolean h) {
        this.hasRamps = h;
    }
    
    //Method
    // Harder if no ramps available
    @Override
    public int calcDifficulty(){
        if (hasRamps){ 
            return 3;
        }else{
            return 7;
        }
    }

   
}
