package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Diregenti extends Dipendenti {
    private String nomeDivisione;

    //Costuttore
    public Diregenti(String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione,
        String nomeDivisione) {
            super(codiceFiscale, nome, cognome, dataAssunzione);
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
