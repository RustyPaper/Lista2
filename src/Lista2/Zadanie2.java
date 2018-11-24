package Lista2;

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        //a
        Set<Integer> zbiorHash = new HashSet<>();
        Set<Integer> zbiorTree = new TreeSet<>();
        Random rand = new Random();
        int n = 5;
        for (int i = 0; i < n; i++) {
            zbiorHash.add(rand.nextInt(50) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (zbiorTree.size() != n)
            zbiorTree.add(rand.nextInt(50) + 1);
        }
        zbiorHash.add(10);
        System.out.println("Tak wygląda zbiór pierwszy: ");
        for (int h : zbiorHash) {
            System.out.println(h);
        }
        zbiorTree.add(10);
        System.out.println("\nTak wygląda zbiór drugi: ");
        for (int t : zbiorTree) {
            System.out.println(t);
        }

        //b
        LinkedHashSet<Integer> diff= new LinkedHashSet<>();

        for (int obj:zbiorHash)
            if (zbiorTree.contains(obj))
                diff.add(obj);

        System.out.println("\nTakie same elementy: " + diff + "\nIlość takich samych elementów: " + diff.size());

        //c
        // Suma
        Set<Integer> suma = new LinkedHashSet<>(zbiorHash);
        suma.addAll(zbiorTree);
        System.out.println("\nSuma dwóch zbiorów: " + suma);

        // Część wspólna
        Set<Integer> czwspolna = new LinkedHashSet<>(zbiorHash);
        czwspolna.retainAll(zbiorTree);
        System.out.println("Część wspólna dwóch zbiorów: " + czwspolna);

        // Różnica
        Set<Integer> roznica = new LinkedHashSet<>(zbiorHash);
        roznica.removeAll(zbiorTree);
        System.out.println("Różnica dwóch zbiorów: " + roznica);

        // Dopełnienie
        Set<Integer> doeplnienie = new LinkedHashSet<>(zbiorTree);
        doeplnienie.removeAll(zbiorHash);
        System.out.println("Dopełnienie dwóch zbiorów: " + doeplnienie);
    }
}
