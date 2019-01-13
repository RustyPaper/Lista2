package Lista2;

import java.math.BigInteger;
import java.util.*;

public class Zadanie5 {

    private static Scanner key;

    public Zadanie5() {
        this.key = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Zadanie5 zadanie5 = new Zadanie5();
        boolean runProgram = true;
        int x = 0;

        Osoba[] osoby = {
                new Osoba(90234234434L, "Tomek", "Kowalski", 33, "Kosciuszki 12", 5),
                new Osoba(90234234434L, "Adrian", "Zielinski", 23, "Sienkiewicza 5", 2),
                new Osoba(90234234434L, "Wojtek", "Czerwony", 32, "Wolnosci 43", 1),
                new Osoba(90234234434L, "Maciek", "Brazowy", 53, "Kwiatowa 1", 10),
                new Osoba(90234234434L, "Marcin", "Niebieski", 20, "Strzegomska 4", 8)
        };

        ArrayDeque<Osoba> kolejka = new ArrayDeque<Osoba>(Arrays.asList(osoby));
        PriorityQueue<Osoba> kolejkaPriorytet = new PriorityQueue<Osoba>(kolejka);


        while (runProgram) {

            System.out.println("[0] Zakoncz dzialanie programu.");
            System.out.println("[1] Zarejstruj nową osobę.");
            System.out.println("[2] Wywowalaj kolejna osobe.");
            System.out.println("[3] Sprawdz kolejke.");
            x = key.nextInt();
            switch (x) {
                case 0:
                    runProgram = false;
                    break;

                case 1:
                    zadanie5.Zarejstruj(kolejka);
                    kolejkaPriorytet.clear();
                    kolejkaPriorytet.addAll(kolejka);
                    break;

                case 2:
                    zadanie5.Wywolaj(kolejkaPriorytet);
                    kolejka.clear();
                    kolejka.addAll(kolejkaPriorytet);
                    break;

                case 3:
                    zadanie5.Podejrzyj(kolejkaPriorytet);
                    kolejkaPriorytet.clear();
                    kolejkaPriorytet.addAll(kolejka);
                    break;

                default:
                    System.out.println("Wprowadzono zły znak.");
                    break;
            }
        }

    }

    public ArrayDeque<Osoba> Zarejstruj(ArrayDeque<Osoba> osoby) {
        Scanner inPriorytet = new Scanner(System.in);
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inAdres = new Scanner(System.in);
        Scanner inWiek = new Scanner(System.in);

        System.out.print("Wprowadź pesel pacjenta: ");
        BigInteger rawpesel = this.key.nextBigInteger();
        Long pesel = rawpesel.longValue();

        System.out.print("Wprowadź imie pacjenta: ");
        String imie = inImie.nextLine();

        System.out.print("Wprowadz nazwisko pacjenta: ");
        String nazwisko = inNazwisko.nextLine();

        System.out.print("Wprowadz wiek pacjenta: ");
        int wiek = inWiek.nextInt();

        System.out.print("Wprowadz adres pacjenta: ");
        String adres = inAdres.nextLine();

        System.out.print("Wprowadz priorytet pacjenta: ");
        int priorytet = inPriorytet.nextInt();

        osoby.addLast(new Osoba(pesel, imie, nazwisko, wiek, adres, priorytet));
        return osoby;
    }

    public PriorityQueue<Osoba> Wywolaj(PriorityQueue<Osoba> osoby) {

        if (!osoby.isEmpty()) {
            Osoba pierwszy = osoby.poll();
            System.out.println("Zapraszam Pacjenta " + pierwszy.getNazwisko());
        } else {
            System.out.println("Nie ma osob w kolejce.");
        }

        return osoby;
    }

    public void Podejrzyj(PriorityQueue<Osoba> osoby) {

        int x;
        boolean runSubProgram = true;
        while (runSubProgram) {

            System.out.println("[0] Wroc do menu.");
            System.out.println("[1] Podejrzyj pierwsza osobe.");
            System.out.println("[2] Podejrzyj ostatnia osobe.");
            System.out.println("[3] Pokaz cala kolejke.");
            x = key.nextInt();
            switch (x) {
                case 0:
                    runSubProgram = false;
                    break;

                case 1:
                    System.out.println(osoby.peek());
                    break;

                case 2:
                    System.out.println(Collections.max(osoby));
                    break;

                case 3:
                    Iterator<Osoba> it = osoby.iterator();

                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    System.out.println("Pozostało " + osoby.size() + " osób w kolejce.");
                    break;

                default:
                    System.out.println("Wprowadzono zły znak.");
                    break;
            }
        }
    }
}

