package org.example;

public class Reservation {
    private int numeroReservation;
    private int dateReservation;
    private String statut;

    public Reservation(int dateReservation, String statut) {
        this.numeroReservation = (int)(Math.random()*1000000);
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public int getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(int dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "numeroReservation=" + numeroReservation +
                ", dateReservation=" + dateReservation +
                ", statut='" + statut + '\'' +
                '}';
    }
}
