package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Tecnici extends Dipendenti{
    private String riferimento;
    private String ambito;

    //Costruttore
    public Tecnici(String categoria, String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione, String riferimento, 
        String ambito) {
            super(categoria, codiceFiscale, nome, cognome, dataAssunzione);
            this.riferimento = riferimento;
            this.ambito = ambito;
            this.stipendio = stipendioTecnico();
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
        return super.toString() + ", ambito=" + ambito + ", riferimento=" + riferimento + "]";
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
        Tecnici other = (Tecnici) obj;
        if (riferimento == null) {
            if (other.riferimento != null)
                return false;
        } else if (!riferimento.equals(other.riferimento))
            return false;
        if (ambito == null) {
            if (other.ambito != null)
                return false;
        } else if (!ambito.equals(other.ambito))
            return false;
        return true;
    }

    public int stipendioTecnico(){
        long anzianita = LocalDate.now().getYear() - getDataAssunzione().getYear();
        if(anzianita < 10){
            return stipendio += 1500;
        }else{
            return stipendio += 1600;
        }
    }

}
