package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Dirigenti extends Dipendenti {
    private String nomeDivisione;

    //Costuttore
    public Dirigenti(String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione, String categoria,
        String nomeDivisione) {
            super(codiceFiscale, nome, cognome, dataAssunzione, categoria);
            this.nomeDivisione = nomeDivisione;
    }
    
    //Getter e Setter
    public String getNomeDivisione() {
        return nomeDivisione;
    }

    public void setNomeDivisione(String nomeDivisione) {
        this.nomeDivisione = nomeDivisione;
    }

    //MetodoToString
    @Override
    public String toString() {
        return "Diregenti [nomeDivisione=" + nomeDivisione + "]";
    }
    
}
