package it.itsincom;

import java.time.LocalDate;
import java.util.ArrayList;

//Inizializzazione parametri
public class Manager extends Dipendenti {
    private String riferimento;
    private String settore;

    // Costruttore
    public Manager(String categoria, String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione,
            String riferimento, String settore) {
        super(categoria, codiceFiscale, nome, cognome, dataAssunzione);
        this.riferimento = riferimento;
        this.settore = settore;
    }

    // costruttore di default
    public Manager() {

    }

    // Getter e Setter
    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        this.settore = settore;
    }

    public String getRiferimento() {
        return riferimento;
    }

    public void setRiferimento(String riferimento) {
        this.riferimento = riferimento;
    }

    // Metodo ToString
    @Override
    public String toString() {
        return super.toString() + ", settore=" + settore + ", riferimento=" + riferimento + "]";
    }

    // Metodo Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manager other = (Manager) obj;
        if (riferimento == null) {
            if (other.riferimento != null)
                return false;
        } else if (!riferimento.equals(other.riferimento))
            return false;
        if (settore == null) {
            if (other.settore != null)
                return false;
        } else if (!settore.equals(other.settore))
            return false;
        return true;
    }

    // calcolo per il calcolo dello stipendio
    public void stipendioManager(ArrayList<Dipendenti> d) {
        for (Dipendenti dipendente : d) {
            if (dipendente instanceof Manager) {
                Manager manager = (Manager) dipendente;
                manager.stipendio += 2000;
                for (Dipendenti dipendente2 : d) {
                    if (dipendente2 instanceof Tecnici) {
                        Tecnici tecnico = (Tecnici) dipendente2;
                        if (tecnico.getCodiceFiscale().equals(manager.getCodiceFiscale())) {
                            manager.stipendio += tecnico.getStipendio() * 0.1;
                        }
                    }
                }
            }
        }
    }

}
