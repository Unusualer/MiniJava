/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minijava;

/**
 *
 * @author elamr
 */
public class MiniJava {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime(); // Record the start time of execution

        // Code to measure

        /*
         * Etudiant etudiant = new Etudiant("123456", "ABC123", "John", "Doe", 1990,
         * "City", "Computer Science",
         * "Bachelor",12, 14, 15, 16, 17, 18, 2, 0, 1, 15, "Company A", 16, "Company B",
         * 17, "Company C");
         */

        TrieFil triefil = new TrieFil();
        TrieCat triecat = new TrieCat();

        array array = new array();
        linkarray linkarray = new linkarray();
        hash hash = new hash();
        linkedhash linkedhash = new linkedhash();

        triefil.start();
        triefil.join();

        triecat.start();
        triecat.join();

        array.start();
        array.join();

        linkarray.start();
        linkarray.join();

        hash.start();
        hash.join();

        linkedhash.start();
        linkedhash.join();

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Le nombre de coeurs : " + cores);

        long endTime = System.nanoTime(); // Record the end time of execution

        long duration = (endTime - startTime) / 1000000; // Calculate the duration in milliseconds

        System.out.println("Execution time: " + duration + " milliseconds");
    }
}
