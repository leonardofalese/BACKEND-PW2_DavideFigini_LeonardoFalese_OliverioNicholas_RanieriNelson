package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Tecnici extends Dipendenti{
    private String ambito;
    private String riferimento;

    //Costruttore
    public Tecnici(String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione, String categoria,
        String ambito, String riferimento) {
            super(codiceFiscale, nome, cognome, dataAssunzione, categoria);
            this.ambito = ambito;
            this.riferimento = riferimento;
    }
    
    //Getter e Setter
    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getRiferimento() {
        return riferimento;
    }

    public void setRiferimento(String riferimento) {
        this.riferimento = riferimento;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Tecnici [ambito=" + ambito + ", riferimento=" + riferimento + "]";
    }

}
