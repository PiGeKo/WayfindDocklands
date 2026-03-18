package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 * most of the methods for the application
 */

//imports
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Stack;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class RouteManager implements Saveable {
 
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
        if (currentRoute.isEmpty()){ 
            return "No streets added yet.";
        }
        StringBuilder sb = new StringBuilder();
        int increment = 1;
        for (Street s : currentRoute) {
            sb.append(increment).append(". ").append(s.toString()).append("\n");
            increment += 1;
    }
    
    return sb.toString();
}
        
    // For the saving functionality, so that people will be able to download and share their routes
    public void saveToCSV(String routeName, int rating, String note, int difficulty) {
        try {
            FileWriter fw = new FileWriter(routeName + ".csv");
            BufferedWriter bw = new BufferedWriter(fw);
        
            bw.write(routeName + "," + rating + "," + note + "," + difficulty);
            bw.newLine();
        
        // 1 street per line
        for (Street s : currentRoute) {
            bw.write(s.getID() + "," + s.getName());
            bw.newLine();
        }
        
        bw.close();
        
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }
    // 2nd part of the functionaality so that people can load the files they saved and read the info
    public String loadFromCSV(String filename) {
        clearCurrentRoute();
        StringBuilder display = new StringBuilder();

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            
            String infoLine = br.readLine();
                if (infoLine != null) {
                    String[] info = infoLine.split(",");
                    display.append("Route: ").append(info[0]).append("\n");
                    display.append("Rating: ").append(info[1]).append("/10\n");
                    display.append("Note: ").append(info[2]).append("\n");
                    display.append("Difficulty: ").append(info[3]).append("/10\n\n");
                    display.append("Streets:\n");
                }
            
            String line;
            int step = 1;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                Street s = new Street(parts[1].trim(), id);
                currentRoute.add(s);
                display.append(step).append(". ").append(s.toString()).append("\n");
                step += 1;
            }

            br.close();

        } catch (IOException e) {
            return "Error loading: " + e.getMessage();
        }

        return display.toString();
    }
}


