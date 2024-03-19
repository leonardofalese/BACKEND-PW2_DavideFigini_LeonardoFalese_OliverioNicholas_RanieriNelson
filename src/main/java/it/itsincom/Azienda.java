package it.itsincom;

import java.util.ArrayList;

//Inizializzazione parametri
public class Azienda {
    private String nomeAzienda = "Recruit ITSolutions";
    private ArrayList<Dipendenti> dipendenti;

    //Costruttore
    public Azienda(ArrayList<Dipendenti> dipendenti) {
        this.dipendenti = dipendenti;
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
        return "\nAzienda [nome dell'azienda=" + nomeAzienda + " \nDipendenti=" + dipendenti + "]\n";
    }

    //Metodo Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Azienda other = (Azienda) obj;
        if (nomeAzienda == null) {
            if (other.nomeAzienda != null)
                return false;
        } else if (!nomeAzienda.equals(other.nomeAzienda))
            return false;
        if (dipendenti == null) {
            if (other.dipendenti != null)
                return false;
        } else if (!dipendenti.equals(other.dipendenti))
            return false;
        return true;
    }

}
