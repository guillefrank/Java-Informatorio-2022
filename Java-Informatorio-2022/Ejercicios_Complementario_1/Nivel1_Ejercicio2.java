import java.util.Scanner;

public class Nivel1_Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int a = scan.nextInt();
        System.out.println("Ingrese un numero entero");
        int b = scan.nextInt();
        scan.close();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        

    }

}