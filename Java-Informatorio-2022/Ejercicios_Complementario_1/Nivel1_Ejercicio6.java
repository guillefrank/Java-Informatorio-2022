import java.util.Scanner;

public class Nivel1_Ejercicio6 {

public static void main(String[] args) {
    Scanner scan= new Scanner (System.in);
    System.out.println("Ingrese numero entero");
    int a=scan.nextInt();
    System.out.println("Ingrese exponente");
    int b=scan.nextInt();
    int elevar=elevar(a,b);
    System.out.println(a+" elevado a "+b+" = "+elevar);
    scan.close();
}

static int elevar(int a,int b){
    int c=1;
    if (b==0){
        return c;
    } 
    
    for(int i=0;i<b;i++){
        c=c*a;
    }
    return c;

}
    
}
