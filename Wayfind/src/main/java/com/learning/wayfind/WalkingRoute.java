/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learning.wayfind;

/**
 *
 * @author Konko
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
 
