
import java.util.ArrayList;

public class Nivel2_Ejercicio5 {
    public static void main(String[] args) {
                
        ArrayList<Integer> horas_trabajadas = new ArrayList<Integer>(5);
        ArrayList<Integer> valorpor_hora = new ArrayList<Integer>(5); 
        ArrayList<Integer> totales = new ArrayList<Integer>(5);       
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);
        System.out.println(horas_trabajadas);
        valorpor_hora.add(350);
        valorpor_hora.add(345);
        valorpor_hora.add(550);
        valorpor_hora.add(600);
        valorpor_hora.add(320);
        System.out.println(valorpor_hora);
        int total=0;        
        for(int i=0;i<horas_trabajadas.size();i++){
            totales.add(i,valorpor_hora.get(i)*horas_trabajadas.get(i));
            
            total+=totales.get(i);               
        }
        System.out.println(totales);
        System.out.println("Total Final: $ "+total);
        
        
        
        

    }
}
