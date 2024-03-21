package it.itsincom;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("C:\\PW2\\BACKEND PW2\\elenco dipendenti.txt"));
        Scanner in2 = new Scanner(System.in);
        ArrayList<Dipendenti> dipendenti = new ArrayList<>();
        Azienda azienda = new Azienda(dipendenti);
        String p;
        while (in.hasNextLine()) {

            String pezzi[] = in.nextLine().split(";");
            if (pezzi[0].equals("dirigente")) {
                azienda.ripetizioneDip(
                        new Dirigenti(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5]));
            } else if (pezzi[0].equals("manager")) {
                azienda.ripetizioneDip(new Manager(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5],
                        pezzi[6]));
            } else if (pezzi[0].equals("tecnico")) {
                azienda.ripetizioneDip(new Tecnici(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5],
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
        ordinamentoPerAssunzione(dipendenti, p);


        Manager manager = new Manager();
        manager.stipendioManager(azienda.getDipendenti());

        Dirigenti dirigenti = new Dirigenti();
        dirigenti.stipendioDirigente(azienda.getDipendenti());

        System.out.println("\n\n////Nome, Cognome, CodFiscale e stipendio dei dipendenti////");
        System.out.println(azienda.stipendi(azienda.getDipendenti()));

        in.close();
        in2.close();
    }

    public static void ordinamentoPerAssunzione(ArrayList<Dipendenti> d, String s){
        // ordinamento per data di assunzione
        d.sort(new Comparator<Dipendenti>() {
            public int compare(Dipendenti o1, Dipendenti o2) {
                return o1.getDataAssunzione().compareTo(o2.getDataAssunzione());
            }
        });
        // estrarre solo quelli della categoria passata come parametro
        System.out.print("\n////elenco dipendenti in ordine di assunzione dei " + s + "//// \n Dipendenti=[");
        for (Dipendenti dipendenti : d) {
            if (dipendenti.getCategoria().equals(s)) {
                System.out.print(dipendenti);
            }
        }
    }
}



//BCDE29013