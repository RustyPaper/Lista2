package Lista2;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadanie3 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Zadanie3 mainClass = new Zadanie3();
        mainClass.init();
    }

    public void init(){
        System.out.println("Do jakiej wartości losować liczby? ");
        int maxRangeNumber = this.input.nextInt();
        System.out.println();
        System.out.println("Ile liczb wylosować?");
        int randomNumbers = this.input.nextInt();

        Map<Integer, Integer> mapa = mapGenerator(maxRangeNumber, randomNumbers);
        System.out.println(mapa);
    }

    public Map<Integer, Integer> mapGenerator(int key, int number) {
        Random random = new Random();
        Map<Integer,Integer> result = new TreeMap();
        int randomNumber = 0;
        for(int i = 0; i < number ; ++i) {
            randomNumber = random.nextInt(key) + 1;

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


/*package Lista2;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Zadanie3 {

    public static void main(String[] args){
        Zadanie3 mainClass = new Zadanie3();
        mainClass.init();

    }

     public void init(){

        int maxRangeNumber = 20;
        int randomNumbers = 100;

        Map<Integer, Integer> mapa = mapGenerator(maxRangeNumber, randomNumbers);
        System.out.println(mapa);
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


