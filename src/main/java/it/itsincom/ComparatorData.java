package it.itsincom;

import java.util.Comparator;

public class ComparatorData implements Comparator<Dipendenti> {

    @Override
    public int compare(Dipendenti o1, Dipendenti o2) {
        return o1.getDataAssunzione().compareTo(o2.getDataAssunzione());
    }

}
