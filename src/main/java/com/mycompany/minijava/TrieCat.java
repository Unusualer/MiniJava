/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author elamr
 */
public class TrieCat extends Thread {

    @Override
    public void run() {
        String csvFile = "src\\main\\java\\com\\mycompany\\minijava\\donnees_etudiants.csv";
        String line = "";
        String cvsSplitBy = ",";

        // Initialize FileWriter for each category
        FileWriter personalWriter = null;
        FileWriter evaluationWriter = null;
        FileWriter disciplineWriter = null;
        FileWriter stageWriter = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the header line
            line = br.readLine();

            // Create FileWriter for each category
            personalWriter = new FileWriter("personal_data.csv");
            evaluationWriter = new FileWriter("evaluation_data.csv");
            disciplineWriter = new FileWriter("discipline_data.csv");
            stageWriter = new FileWriter("stage_data.csv");

            // Write headers to each file
            personalWriter.write("cne,cin,Nom,Prenom,anneeNaissance,VilleBac\n");
            evaluationWriter.write("cne,noteS1,noteS2,noteS3,noteS4,noteS5,noteS6\n");
            disciplineWriter.write("cne,nbrAbsences,nbrRapportsMauvaiseConduite,nbrRapportsTriche\n");
            stageWriter.write("cne,noteStage1,lieuxStage1,noteStage2,lieuxStage2,noteStage3,lieuxStage3\n");

            // Loop through the remaining lines
            while ((line = br.readLine()) != null) {
                // Split the line by commas
                String[] data = line.split(cvsSplitBy);

                // Write data to appropriate file based on category
                personalWriter.write(
                        data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "\n");
                evaluationWriter.write(data[0] + "," + data[8] + "," + data[9] + "," + data[10] + "," + data[11] + ","
                        + data[12] + "," + data[13] + "\n");
                disciplineWriter.write(data[0] + "," + data[14] + "," + data[15] + "," + data[16] + "\n");
                stageWriter.write(data[0] + "," + data[17] + "," + data[18] + "," + data[19] + "," + data[20] + ","
                        + data[21] + "," + data[22] + "\n");
            }

            // Close all FileWriter objects
            personalWriter.close();
            evaluationWriter.close();
            disciplineWriter.close();
            stageWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
