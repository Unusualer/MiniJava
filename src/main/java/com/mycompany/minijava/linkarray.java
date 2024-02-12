/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

import java.util.LinkedList;

/**
 *
 * @author elamr
 */
public class linkarray extends Thread {
    public void run() {
        // Initialize data structures
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Number of elements to add
        int numElements = 100000;

        // Time measurements
        long startTime, endTime;
        double duration;

        // Add operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("LinkedList Add Time: " + duration + " milliseconds");

        // Remove operation
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("LinkedList Remove Time: " + duration + " milliseconds");

        // Contains operation
        startTime = System.nanoTime();
        linkedList.contains(numElements / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1e6; // Convert to milliseconds
        System.out.println("LinkedList Contains Time: " + duration + " milliseconds");
    }
}
