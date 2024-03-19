package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Dipendenti implements Comparable<Dipendenti> {
    private String categoria;
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private int stipendio;

    public Dipendenti(String categoria, String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione) {
        this.categoria = categoria;
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.dataAssunzione = dataAssunzione;
    }

    // Getter e Setter
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Metodo ToString
    @Override
    public String toString() {
        return "\n[categoria=" + categoria + ", codiceFiscale=" + codiceFiscale + ", nome=" + nome
                + ", cognome=" + cognome + ", dataAssunzione=" + dataAssunzione + ", stipendio=" + stipendio;
    }

    // Metodo Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dipendenti other = (Dipendenti) obj;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (codiceFiscale == null) {
            if (other.codiceFiscale != null)
                return false;
        } else if (!codiceFiscale.equals(other.codiceFiscale))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cognome == null) {
            if (other.cognome != null)
                return false;
        } else if (!cognome.equals(other.cognome))
            return false;
        if (dataAssunzione == null) {
            if (other.dataAssunzione != null)
                return false;
        } else if (!dataAssunzione.equals(other.dataAssunzione))
            return false;
        if (stipendio != other.stipendio)
            return false;
        return true;
    }

    @Override
    public int compareTo(Dipendenti o) {
        return this.cognome.compareTo(o.cognome);
    }
}
