import java.util.Scanner;

public class Nivel1_Ejercicio7{
    

    static void cambiarAMayusc(String s){
         
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch>64&&ch<91){
                ch=ch+32;
                System.out.print( (char) ch);
            }
            else if(ch>96&&ch<123){
                ch=ch-32;
                System.out.print( (char) ch);
            }
            if(ch==32){
            System.out.print(" ");
            }
        }
    }

    public static void main (String args[])
    {

        System.out.println("Ingrese una palabra");
        Scanner scan= new Scanner(System.in);
        String frase=scan.next();
        scan.close();        
        Nivel1_Ejercicio7.cambiarAMayusc(frase);

    }
}
