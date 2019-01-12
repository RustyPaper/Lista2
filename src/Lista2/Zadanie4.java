package Lista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Zadanie4 {


    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();
                osoby.add(new Osoba(90234234434L, "Tomek", "Kowalski", 33, "Kosciuszki 12", 5));
                osoby.add(new Osoba(90234234434L, "Tomek", "Kowalski", 33, "Kosciuszki 12", 5));
                osoby.add(new Osoba(90234234434L, "Adrian", "Zielinski", 23, "Sienkiewicza 5", 2));
                osoby.add(new Osoba(90234234434L, "Wojtek", "Czerwony", 32, "Wolnosci 43", 1));
                osoby.add(new Osoba(90234234434L, "Adam", "Brazowy", 53, "Kwiatowa 1", 10));
                osoby.add(new Osoba(90234234434L, "Marcin", "Niebieski", 20, "Strzegomska 4", 8));

        ListIterator<Osoba> it = osoby.listIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Usówanie wszystkich, którzy mają 33 lata ");

        for (Iterator<Osoba> it2 = osoby.iterator(); it2.hasNext();) {
            Osoba p = it2.next();
            if (p.getWiek() == 33) {
                it2.remove();
            }
        }

        ListIterator<Osoba> it3 = osoby.listIterator();

        while (it3.hasNext()){
            System.out.println(it3.next());
        }


    }





}
