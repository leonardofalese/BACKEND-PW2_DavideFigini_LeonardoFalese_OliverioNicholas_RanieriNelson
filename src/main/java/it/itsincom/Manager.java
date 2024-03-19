package it.itsincom;

import java.time.LocalDate;

//Inizializzazione parametri
public class Manager extends Dipendenti{
    private String settore;
    private String riferimento;

    //Costruttore
    public Manager(String codiceFiscale, String nome, String cognome, LocalDate dataAssunzione, String settore,
            String riferimento) {
        super(codiceFiscale, nome, cognome, dataAssunzione);
        this.settore = settore;
        this.riferimento = riferimento;
    }

    //Getter e Setter
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

    //Metodo ToString
    @Override
    public String toString() {
        return "Manager [settore=" + settore + ", riferimento=" + riferimento + "]";
    }

}
