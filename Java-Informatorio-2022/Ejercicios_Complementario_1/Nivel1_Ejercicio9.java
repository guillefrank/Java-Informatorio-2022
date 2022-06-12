import java.util.Scanner;
public class Nivel1_Ejercicio9 {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese un texto cualquiera");
        String texto=scan.nextLine();
        System.out.println("Ingrese letra que desea buscar");
        char letra=scan.next().charAt(0);
        
        scan.close();
        int buscar=buscar(texto,letra);
        System.out.println("La cantidad de veces que se repite "+letra+" es "+buscar);
    }

    static int buscar(String a,char b){
        
        int c=0;
        for(int i=0;i<a.length();i++){
            if (b==a.charAt(i)){
                c=c+1;
                
            }
        }
        return c;

    }
    
}
