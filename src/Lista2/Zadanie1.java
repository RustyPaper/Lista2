package Lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {

        List<String> lista = new LinkedList<>();

        //a)
        lista.add("Asia");
        lista.add("Basia");
        lista.add("Celina");
        lista.add("Danka");
        lista.add("Ewelina");
        lista.add("Franka");
        lista.add("Gosia");
        lista.add("Hania");
        lista.add("Iga");
        lista.add("Julia");

        System.out.println("Lista do podpunktu a) wygląda następująco: " + lista);

        //b)
        System.out.println("\nOto 3 pierwsze elementy listy: " + "\n" + lista.get(0) + "\n" + lista.get(1) + "\n" + lista.get(2));
        System.out.println("A to 3 ostatnie elementy listy: "+ "\n" + lista.get(7) + "\n" + lista.get(8) + "\n" + lista.get(9));

        System.out.println("\nLista do podpunktu b) wygląda następująco: " + lista);
        //c)
        lista.add(4, "Wieslawa");
        System.out.println("\nNowy elementy na 5 pozycji: " + lista );

        System.out.println("Lista do podpunktu c) wygląda następująco: " + lista + "\n");

        //d)
        for (int i = 0; i < 3; i++){
            System.out.println("Usunięty z początku element: " + ((LinkedList<String>) lista).removeFirst());
            System.out.println("Usunięty z końca element: " + ((LinkedList<String>) lista).removeLast());
        }

        System.out.println("\nLista do podpunktu d) wygląda następująco: " + lista);

        //e)
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Olek");
        lista2.add("Bolek");
        lista2.add("Lolek");
        lista2.add("Fiolek");
        lista2.add("Trolek");
        lista2.add("Boniek");


        lista.addAll(lista2);

        System.out.println("\nElementy do wcielenia w listę pierwszą: " + lista2);
        System.out.println("Lista do podpunktu e) wygląda następująco (po scaleniu): " + lista);

        //f
        Collections.sort(lista);
        System.out.println("\nLista posortowana alfabetycznie: " + lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista posortowana odwrotnie do alfabetycznej: " + lista);


    }
}
