import java.util.Scanner;
public class Nivel1_Ejercicio5 {

    public static void main(String[] args) {
        
    System.out.println("Ingrese un numero entero a multiplicar");
    Scanner scan= new Scanner(System.in);
    int a=scan.nextInt();
    System.out.println("Ingrese un numero entero multiplicador");
    int b=scan.nextInt();
    int multip= multip(a,b);
    System.out.println("El resultado de la multiplicacion es "+ multip);
    scan.close();
    }
    
    static int multip(int a, int b){
        int c = 0;
        if((a != 0) && (b != 0)){
            for(int i=0;i<b;i++){
                c=c+a;        
            }
        }
        return c;
        
    }
    
        
    
    
}
