package Lista2;

import java.util.*;

public class Zadanie3 {
    public static void main(String[] args) {

    Scanner key = new Scanner(System.in);

    System.out.println("Podaj wartość maksymalną przedziału liczb losowych: ");
    int x = key.nextInt();
    System.out.println("Ile wartości mam wylosować?");
    int y = key.nextInt();

    Zadanie3 los = new Zadanie3();
    Map<Integer, Integer> mapa = new TreeMap();
    for (int i = 0; i < y; i++) {
        mapa.put(los.losowanie(x), los.losowanie(y));
    }

    Set<Integer> keySet = mapa.keySet();
    Collection<Integer> valueSet = mapa.values();
    System.out.println("Ilość wartości: " + mapa.size());
    System.out.println("Klucze: " + keySet);
    System.out.println("Wartości:" + valueSet);

}


public int losowanie (int x){
    Random rand = new Random();
    x = rand.nextInt(x-1) + 1;
    return x;
    }



}

/*
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        Main mainClass = new Main();
        mainClass.init();
    }

     public void init(){

        int maxRangeNumber = 20;
        int randomNumbers = 100;

        Map<Integer, Integer> mapa = mapGenerator(maxRangeNumber, randomNumbers);
    }

    public Map<Integer, Integer> mapGenerator(int X, int Y) {
        Random random = new Random();
        Map<Integer,Integer> result = new TreeMap();
        int randomNumber = 0;
        for(int i =0; i < Y ; ++i) {
            randomNumber = random.nextInt(X-1)+1;

            if (!result.keySet().contains(randomNumber)) {
                result.put(randomNumber, 0);
            }
            else {
                int value = result.get(randomNumber);
                result.put(randomNumber, ++value);
            }
        }
        return result;
    }
}
 */

