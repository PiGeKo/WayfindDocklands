package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 */
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Stack;
 
public class RouteManager {
 
    private HashMap<String, Route> routes;
    private Stack<Street> undoStack;
    private LinkedList<Street> currentRoute;
    //Constructor
    public RouteManager() {
        routes = new HashMap<>();
        undoStack = new Stack<>();
        currentRoute = new LinkedList<>();
    }
    
    //Methods
    public void addRoute(String name, Route route) {
    
    }
    
    public Route getRoute(String name) {
        return null;
    }
    
    public void updateRoute(String name, Route route) {
    
    }
    
    public void deleteRoute(String name) {
    
    }
    public void undoLastStreet() {
    
    }
    public void saveToCSV(String filename) {
    
    }
    public void loadFromCSV(String filename) {
    
    }

}


