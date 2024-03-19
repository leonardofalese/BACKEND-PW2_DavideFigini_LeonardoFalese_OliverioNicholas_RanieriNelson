package it.itsincom;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\PW2\\pw2\\elenco dipendenti.txt"));
        ArrayList<Dipendenti> dipendenti = new ArrayList<>();
        Azienda azienda = new Azienda(dipendenti);
        while(in.hasNextLine()) {
            String pezzi[] = in.nextLine().split(";");
            if(pezzi[0].equals("dirigente")) {
                dipendenti.add(new Dirigenti(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5]));
            } else if (pezzi[0].equals("manager")) {
                dipendenti.add(new Manager(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5], pezzi[6]));
            } else if (pezzi[0].equals("tecnico")) {
                dipendenti.add(new Tecnici(pezzi[0], pezzi[1], pezzi[2], pezzi[3], LocalDate.parse(pezzi[4]), pezzi[5], pezzi[6]));
            } 
        }
        System.out.println(azienda.toString());

        in.close();
    }
}
