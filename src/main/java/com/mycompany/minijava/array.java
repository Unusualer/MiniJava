/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

import java.util.ArrayList;

/**
 *
 * @author elamr
 */
public class array extends Thread {
    public void run() {
        // Initialize data structures
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Number of elements to add
        int numElements = 100000;

        // Time measurements
        long startTime, endTime;
        double duration;

        // Add operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("ArrayList Add Time: " + duration + " milliseconds");

        // Remove operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("ArrayList Remove Time: " + duration + " milliseconds");

        // Contains operation
        startTime = System.nanoTime();
        arrayList.contains(numElements / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("ArrayList Contains Time: " + duration + " milliseconds");
    }
}
