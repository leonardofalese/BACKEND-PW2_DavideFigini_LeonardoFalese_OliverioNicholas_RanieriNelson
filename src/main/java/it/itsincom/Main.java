package it.itsincom;

//librerie 
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("C:\\PW2\\BACKEND PW2\\elenco dipendenti.txt"));
        Scanner in2 = new Scanner(System.in);
        ArrayList<Dipendenti> dipendenti = new ArrayList<>();
        Azienda azienda = new Azienda(dipendenti);
        String p;

        // ciclo while per il popolmento dell'ArrayList letto dal file "elenco
        // dipendenti.txt"
        while (in.hasNextLine()) {

            String pezzi[] = in.nextLine().split(";");
            if (pezzi[0].equals("dirigente")) {
                azienda.ripetizioneDip(
                        new Dirigenti(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5]));
            } else if (pezzi[0].equals("manager")) {
                azienda.ripetizioneDip(
                        new Manager(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5],
                                pezzi[6]));
            } else if (pezzi[0].equals("tecnico")) {
                azienda.ripetizioneDip(
                        new Tecnici(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5],
                                pezzi[6]));
            }
        }
        System.out.print("////Lettura file////");
        System.out.println(azienda.toString());

        Collections.sort(azienda.getDipendenti());

        System.out.print("////Ordine alfabetico dei dipendenti per cognome////");
        System.out.println(azienda.toString());

        System.out.print("Che categoria vuoi ordinare?: ");
        p = in2.next();
        controllo(p);
        if(controllo(p) == true){
            ordinamentoPerAssunzione(dipendenti, p);
        }else{
            System.out.println("Dipendente non trovato :(");
        }

        azienda.stipendioManager(azienda.getDipendenti());
        azienda.stipendioDirigente(azienda.getDipendenti());

        System.out.println("\n\n////Nome, Cognome, CodFiscale e stipendio dei dipendenti////");
        System.out.println(azienda.stipendi(azienda.getDipendenti()));

        creazioneFileJson(azienda.getDipendenti());

        in.close();
        in2.close();
    }

    public static void ordinamentoPerAssunzione(ArrayList<Dipendenti> d, String s) {
        // ordinamento per data di assunzione
        d.sort(new ComparatorData());
        // estrae solo quelli della categoria passata come parametro
        System.out.print("\n////elenco dipendenti in ordine di assunzione dei " + s + "//// \n Dipendenti=[");
        for (Dipendenti dipendenti : d) {
            if (dipendenti.getCategoria().equals(s)) {
                System.out.print(dipendenti);
            }
        }
    }

    // metodo per la creazione e popolamento del file "dipendenti.json"
    public static void creazioneFileJson(ArrayList<Dipendenti> d) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(d);
        try {
            FileWriter writer = new FileWriter("dipendenti.json");
            writer.write(json);
            writer.close();
            System.out.println("Il file JSON è stato creato correttamente.");
        } catch (IOException e) {
            System.out.println("Si è verificato un errore durante la scrittura del file JSON.");
            e.printStackTrace();
        }
    }

    public static boolean controllo(String s) throws Exception{
        boolean prova = false;
        try {
            if(s.equalsIgnoreCase("tecnico") || s.equalsIgnoreCase("manager") || s.equalsIgnoreCase("dirigente")){
                prova = true;
            }
        } catch (Exception e) {
            prova = false;
        }

        return prova;
    }
}
