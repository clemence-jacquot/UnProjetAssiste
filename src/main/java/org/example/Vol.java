package org.example;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "numeroVol=" + numeroVol +
                ", origine='" + origine + '\'' +
                ", destination='" + destination + '\'' +
                ", dateHeureDepart='" + dateHeureDepart + '\'' +
                ", dateHeureArrivee='" + dateHeureArrivee + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }

    public String obtenirVol(int numeroVol) {
        return "Vol{" +
                "numeroVol=" + numeroVol +
                ", origine='" + origine + '\'' +
                ", destination='" + destination + '\'' +
                ", dateHeureDepart='" + dateHeureDepart + '\'' +
                ", dateHeureArrivee='" + dateHeureArrivee + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }
}
