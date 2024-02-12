/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;*/

/**
 *
 * @author elamr
 */
public class TrieFil extends Thread {

    @Override
    public void run() {
        String csvFile = "src\\main\\java\\com\\mycompany\\minijava\\donnees_etudiants.csv";
        String line = "";
        String cvsSplitBy = ",";
        Map<String, FileWriter> fileWriters = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the header line
            line = br.readLine();

            // Loop through the remaining lines
            while ((line = br.readLine()) != null) {
                // Split the line by commas
                String[] data = line.split(cvsSplitBy);
                String filiere = data[6]; // Assuming filiere is at index 6, adjust if needed

                // Remove double quotes from filiere name
                filiere = filiere.replace("\"", "");

                // Create a FileWriter for the filiere if not already created
                if (!fileWriters.containsKey(filiere)) {
                    FileWriter fw = new FileWriter(filiere + "_students.csv");
                    fw.append(
                            "cne,cin,Nom,Prenom,anneeNaissance,VilleBac,filiere,niveau,noteS1,noteS2,noteS3,noteS4,noteS5,noteS6,nbrAbsences,nbrRapportsMauvaiseConduite,nbrRapportsTriche,noteStage1,lieuxStage1,noteStage2,lieuxStage2,noteStage3,lieuxStage3\n");
                    fileWriters.put(filiere, fw);
                }

                // Write the data to the FileWriter for the filiere
                FileWriter fw = fileWriters.get(filiere);
                fw.append(String.join(",", data) + "\n");
            }

            // Close all FileWriter objects
            for (FileWriter fw : fileWriters.values()) {
                fw.flush();
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the exception trace for debugging
        }
    }
}
