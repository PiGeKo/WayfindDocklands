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
        routes.put(name, route);
    }

    public Route getRoute(String name) {
        return routes.get(name);
    }

    public void updateRoute(String name, Route route) {
        routes.put(name, route);
    }

    public void deleteRoute(String name) {
        routes.remove(name);
    }
    public void undoLastStreet() {
        if (!undoStack.isEmpty()){
        undoStack.pop();
        currentRoute.removeLast();
        }
    }
    
    public void addStreetToRoute(Street street) {
        currentRoute.add(street);
        undoStack.push(street);
    }
    
    public void clearCurrentRoute() {
        currentRoute.clear();
        undoStack.clear();
    }
    
    public LinkedList<Street> getCurrentRoute() {
        return currentRoute;
    }
    
    public String getCurrentRouteDisplay() {
        if (currentRoute.isEmpty()) return "No streets added yet.";
        StringBuilder sb = new StringBuilder();
    
    int increment = 1;
    for (Street s : currentRoute) {
        sb.append(increment).append(". ").append(s.toString()).append("\n");
        increment += 1;
    }
    
    return sb.toString();
}
    
    
    
    public void saveToCSV(String routeName, int rating, String note) {
    // add the code to save the thing to the csv
    }
    
    public String loadFromCSV(String filename) {
    // add the code to load the thing from csv
    return "";

}
}


