import java.util.Scanner;
public class Nivel2_Ejercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de ciudades a ingresar: ");
        int cantidad = scan.nextInt();
        String [] ciudadesFavoritas = new String[cantidad];       

        for(int i = 0; i <cantidad ; i++){
            System.out.println("Ingrese ciudad favorita: ");
            String ciudad=scan.next();
            ciudadesFavoritas[i]=("#"+i+" - "+ciudad);
        }

        System.out.println();
        System.out.println("Ciudades favoritas: ");
        scan.close();

        for(int i= 0; i< cantidad; i++){
                 System.out.println(ciudadesFavoritas[i]);
        }
         
    }
}