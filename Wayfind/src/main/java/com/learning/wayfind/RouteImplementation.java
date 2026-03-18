package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 * All routes types must implement the route, difficulty, rating
 */
public interface RouteImplementation {
    
    Route getRoute();
    int getDifficulty();
    int getRating();
    
    
    
}

