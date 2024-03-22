package it.itsincom;

import java.util.ArrayList;

//Inizializzazione parametri
public class Azienda {
    private String nomeAzienda = "Recruit ITSolutions";
    private ArrayList<Dipendenti> dipendenti;

    // Costruttore
    public Azienda(ArrayList<Dipendenti> dipendenti) {
        this.dipendenti = dipendenti;
    }

    // Getter e Setter
    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public ArrayList<Dipendenti> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(ArrayList<Dipendenti> dipendenti) {
        this.dipendenti = dipendenti;
    }

    // Metodo ToString
    @Override
    public String toString() {
        return "\nAzienda [nome dell'azienda=" + nomeAzienda + " \nDipendenti=" + dipendenti + "]\n";
    }

    // metodo per visualizzare gli stipendi dei dipendenti
    public String stipendi(ArrayList<Dipendenti> d) {
        String s = "";
        for (Dipendenti dipendente : d) {
            s += "nome: " + dipendente.getNome() + ", " + "cognome: " + dipendente.getCognome() + ", "
                    + "codice fiscale: " + dipendente.getCodiceFiscale() + ", " + "stipendio: "
                    + dipendente.getStipendio() + "\n";
        }
        return s;
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

    // metodo per la verificare se ci sono dipendenti con CodFisc identico
    public void ripetizioneDip(Dipendenti d) throws Exception {
        for (Dipendenti dipendente : dipendenti) {
            if (dipendente.getCodiceFiscale().equals(d.getCodiceFiscale())) {
                throw new Exception("Il dipendenre " + d.getNome() + " è già presente perché il CodFisc: "
                        + d.getCodiceFiscale() + " si ripete");
            }
        }
        if (d instanceof Tecnici) {
            Tecnici tecnico = (Tecnici) d;
            dipendenti.add(tecnico);
        }
        if (d instanceof Manager) {
            Manager manager = (Manager) d;
            dipendenti.add(manager);
        }
        if (d instanceof Dirigenti) {
            Dirigenti dirigente = (Dirigenti) d;
            dipendenti.add(dirigente);
        }
    }

}
