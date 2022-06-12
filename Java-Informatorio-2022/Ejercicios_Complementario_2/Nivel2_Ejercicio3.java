import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Nivel2_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        ArrayList<String> baraja = new ArrayList<String>();
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");
        baraja.add("A");

        System.out.println("Inicio ordenado");
        for (int k = 0; k <baraja.size() ; k++) {
            System.out.println(baraja.get(k));
        }
        System.out.println();
        System.out.println("Baraja en reverso");
        Collections.reverse(baraja);
        for (int i = 0; i <baraja.size() ; i++) {
            System.out.println(baraja.get(i));
        }
        System.out.println();
        System.out.println("Baraja mezclada");
        Collections.shuffle(baraja);

        for (int j = 0; j <baraja.size() ; j++) {
            System.out.println(baraja.get(j));
        }
        
        scan.close();

    }



}

