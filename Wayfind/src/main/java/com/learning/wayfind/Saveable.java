/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.learning.wayfind;

/**
 *
 * Piotr Konkol
 * 2026
 * interface for saving
 */
public interface Saveable {
    void saveToCSV(String filename, int rating, String note, int difficulty);
    String loadFromCSV(String filename);
}
