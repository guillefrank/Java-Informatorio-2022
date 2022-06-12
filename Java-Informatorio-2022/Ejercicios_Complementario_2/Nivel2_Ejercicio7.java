import java.util.Scanner;
import java.util.ArrayList;
public class Nivel2_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Este programa se llama FizzBuzz");
        System.out.println("ingrese numero incial");
        int a= scan.nextInt();
        System.out.println("ingrese numero final");
        int b= scan.nextInt();
        ArrayList<String>fizzBuzzFuncion=fizzBuzzFuncion(a,b); 
        scan.close();
        System.out.print(fizzBuzzFuncion);     

    }

    private static ArrayList<String> fizzBuzzFuncion(int a, int b) {
        ArrayList<String> fizzbuzz = new ArrayList<String>();
        for(int i=a;i<b;i++){
            if((i%2==0)&&(i%3==0)){
                fizzbuzz.add("FizzBuzz");
            }else{
                if(i%2==0){fizzbuzz.add("Fizz");
                }else{
                    if(i%3==0){fizzbuzz.add("Buzz");
                    }else{
                        int numero=i;
                            String numerocadena= String.valueOf(numero);
                            fizzbuzz.add(numerocadena);
                    }

                }
            }
              

        }
         return fizzbuzz;       

    }
}
