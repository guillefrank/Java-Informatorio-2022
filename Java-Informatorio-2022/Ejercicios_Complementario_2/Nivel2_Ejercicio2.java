import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Nivel2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        ArrayList<Integer> arreglo = new ArrayList<Integer>(5);
                
        System.out.println("Ingrese 5 numeros");
        
        for(int i=0;i<5;i++){
            
            System.out.println("Ingrese el "+(i+1)+ " numero");
            int a=scan.nextInt();
            arreglo.add(i , a);
        }
        Iterator<Integer> iterador= arreglo.iterator();
        while(iterador.hasNext()) {
			
			System.out.print(" "+iterador.next()+" ");
		}
        System.out.println();
        System.out.println("Ingresar un valor al inicio ");
        int inicio=scan.nextInt();
        System.out.println("Ingresar un valor al final ");
        int finall=scan.nextInt();
        System.out.println();
        arreglo.add(0,inicio);
        arreglo.add(arreglo.size(),finall);
        scan.close();   
        Iterator<Integer> niterador= arreglo.iterator();     
        
        while(niterador.hasNext()) {
			
			System.out.print(" "+niterador.next()+" ");
		}
    }
}
