/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minijava;

/**
 *
 * @author elamr
 */
public class Etudiant {
    public String cne;
    public String cin;
    public String nom;
    public String prenom;
    public int anneeNaissance;
    public String villeBac;
    public String filiere;
    public String niveau;
    public double noteS1;
    public double noteS2;
    public double noteS3;
    public double noteS4;
    public double noteS5;
    public double noteS6;
    public int nbrAbsences;
    public int nbrRapportsMauvaiseConduite;
    public int nbrRapportsTriche;
    public double noteStage1;
    public String lieuxStage1;
    public double noteStage2;
    public String lieuxStage2;
    public double noteStage3;
    public String lieuxStage3;

    public Etudiant(String cne, String cin, String nom, String prenom, int anneeNaissance, String villeBac,
            String filiere, String niveau, double noteS1, double noteS2, double noteS3, double noteS4,
            double noteS5, double noteS6, int nbrAbsences, int nbrRapportsMauvaiseConduite,
            int nbrRapportsTriche, double noteStage1, String lieuxStage1, double noteStage2,
            String lieuxStage2, double noteStage3, String lieuxStage3) {
        this.cne = cne;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.villeBac = villeBac;
        this.filiere = filiere;
        this.niveau = niveau;
        this.noteS1 = noteS1;
        this.noteS2 = noteS2;
        this.noteS3 = noteS3;
        this.noteS4 = noteS4;
        this.noteS5 = noteS5;
        this.noteS6 = noteS6;
        this.nbrAbsences = nbrAbsences;
        this.nbrRapportsMauvaiseConduite = nbrRapportsMauvaiseConduite;
        this.nbrRapportsTriche = nbrRapportsTriche;
        this.noteStage1 = noteStage1;
        this.lieuxStage1 = lieuxStage1;
        this.noteStage2 = noteStage2;
        this.lieuxStage2 = lieuxStage2;
        this.noteStage3 = noteStage3;
        this.lieuxStage3 = lieuxStage3;
    }
}
