/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

import java.util.LinkedHashSet;

/**
 *
 * @author elamr
 */
public class linkedhash extends Thread {
    public void run() {
        // Initialize data structures
        LinkedHashSet<Integer> linkedhashSet = new LinkedHashSet<>();

        // Number of elements to add
        int numElements = 100000;

        // Time measurements
        long startTime, endTime;
        double duration;

        // Add operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedhashSet.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("LinkedHashSet Add Time: " + duration + " milliseconds");

        // Remove operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedhashSet.remove(0);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("LinkedHashSet Remove Time: " + duration + " milliseconds");

        // Contains operation
        startTime = System.nanoTime();
        linkedhashSet.contains(numElements / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("LinkedHashSet Contains Time: " + duration + " milliseconds");
    }
}
