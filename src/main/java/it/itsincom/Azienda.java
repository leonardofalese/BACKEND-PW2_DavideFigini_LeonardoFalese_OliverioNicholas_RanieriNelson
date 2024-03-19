package it.itsincom;

import java.util.ArrayList;

//Inizializzazione parametri
public class Azienda {
    private String nomeAzienda = "Recruit ITSolutions";
    private ArrayList<Dipendenti> dipendenti;

    //Costruttore
    public Azienda(String nomeAzienda, ArrayList<Dipendenti> dipendenti) {
        this.nomeAzienda = nomeAzienda;
        this.dipendenti = new ArrayList<>();
    }

    //Getter e Setter
    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public ArrayList<Dipendenti> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(ArrayList<Dipendenti> dipendenti) {
        this.dipendenti = dipendenti;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Azienda [nomeAzienda=" + nomeAzienda + ", dipendenti=" + dipendenti + "]";
    }
 
}
