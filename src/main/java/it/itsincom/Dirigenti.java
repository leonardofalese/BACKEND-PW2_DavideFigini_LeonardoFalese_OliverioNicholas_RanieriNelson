package it.itsincom;

import java.time.LocalDate;
import java.util.ArrayList;

//Inizializzazione parametri
public class Dirigenti extends Dipendenti {
    private String nomeDivisione;

    //Costuttore
    public Dirigenti(String categoria, String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione,
        String nomeDivisione) {
            super(categoria, codiceFiscale, nome, cognome, dataAssunzione);
            this.nomeDivisione = nomeDivisione;
    }

    public Dirigenti(){

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
        return super.toString() + ", nomeDivisione=" + nomeDivisione + "]";
    }

    //Metodo Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dirigenti other = (Dirigenti) obj;
        if (nomeDivisione == null) {
            if (other.nomeDivisione != null)
                return false;
        } else if (!nomeDivisione.equals(other.nomeDivisione))
            return false;
        return true;
    }

    public void stipendioDirigente(ArrayList<Dipendenti> d){
        for(Dipendenti dipendente : d){
            if(dipendente instanceof Dirigenti){
                Dirigenti dirigente = (Dirigenti) dipendente;
                dirigente.stipendio += 2500;
                for (Dipendenti dipendente2 : d) {
                    if(!(dipendente2 instanceof Dirigenti)){
                        dirigente.stipendio += dipendente.getStipendio() * 0.1;
                    }
                }
            }
        }
    }
     
}
