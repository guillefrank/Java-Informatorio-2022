import java.util.Scanner;

public class Nivel1_Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese Nombre y Apellido");
        String nomb=scan.nextLine();
        System.out.println("Edad");
        String edad=scan.nextLine();
        System.out.println("Direccion");
        String dire=scan.nextLine();
        System.out.println("Ciudad");
        String ciudad=scan.nextLine();
        System.out.println(ciudad +" - "+ dire+" - "+edad+" - "+nomb );
        scan.close();


    }    
    
}
