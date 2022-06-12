import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Nivel2_Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        ArrayList<String> alumnos = new ArrayList<String>(12);
        System.out.println("Ingrese 12 Alumnos ");
        
        for(int i=0;i<12;i++){
            
            System.out.print("Ingrese el "+(i+1)+ " alumno: ");
            String a=scan.nextLine();
            alumnos.add(i , a);
        }
        List<String> alumnos1 = alumnos.subList(0, 4);
        List<String> alumnos2 = alumnos.subList(4, 8);
        List<String> alumnos3 =alumnos.subList(8, 12);

        System.out.println();
        System.out.println("Curso 1");
        System.out.println();

        for (String c1 : alumnos1) {

            System.out.println(c1);

        }

        System.out.println();
        System.out.println("Curso 2");
        System.out.println();

        for (String c2 : alumnos2) {

            System.out.println(c2);

        }


        System.out.println();
        System.out.println("Curso 3");
        System.out.println();

        for (String c3 : alumnos3) {

            System.out.println(c3);
        }
        scan.close();
    }


    
}
