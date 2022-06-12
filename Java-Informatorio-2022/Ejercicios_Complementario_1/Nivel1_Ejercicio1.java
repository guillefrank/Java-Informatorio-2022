import java.util.Scanner;

public class Nivel1_Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor");
       String nombre= entrada.nextLine();
       System.out.println("Hola "+ nombre+ "!!!"); 
       entrada.close();        
    }

    
}
