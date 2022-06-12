import java.util.Scanner;

public class Nivel1_Ejercicio4 {   
    
        public static void main(String[] args) {
            
            long factorial=1;
            int num;
            Scanner scan = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            num = scan.nextInt();
            scan.close();
            for (int i = num; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }