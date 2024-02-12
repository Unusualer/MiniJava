/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

import java.util.HashSet;

/**
 *
 * @author elamr
 */
public class hash extends Thread {
    public void run() {
        // Initialize data structures
        HashSet<Integer> hashSet = new HashSet<>();

        // Number of elements to add
        int numElements = 100000;

        // Time measurements
        long startTime, endTime;
        double duration;

        // Add operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("HashSet Add Time: " + duration + " milliseconds");

        // Remove operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.remove(0);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("HashSet Remove Time: " + duration + " milliseconds");

        // Contains operation
        startTime = System.nanoTime();
        hashSet.contains(numElements / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("HashSet Contains Time: " + duration + " milliseconds");
    }
}
