package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Dipendenti {                                                              
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private int stipendio;
    

    public Dipendenti(String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione) {
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.dataAssunzione = dataAssunzione;
    }

    //Getter e Setter
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Dipendenti [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome
                + ", dataAssunzione=" + dataAssunzione + ", stipendio=" + stipendio + "]";
    }
    
}