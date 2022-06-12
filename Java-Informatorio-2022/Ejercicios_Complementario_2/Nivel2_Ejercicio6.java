import java.util.*;
public class Nivel2_Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleados = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleados.add(new Empleado("Miguel Martinez", 54642124, 6, 350));
        empleados.add(new Empleado("Juan Gonzalez", 24687368, 7, 345));
        empleados.add(new Empleado("Joselo Melgar", 94537816, 8, 550));
        empleados.add(new Empleado("Valeria VillaBlanca", 87645210, 4, 600));
        empleados.add(new Empleado("Rut Rauchbach", 798546310, 5, 320));

        for (Empleado crearUnaTabla : empleados) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario por DNI:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }

    
}
    class Empleado {
        String nombre;
        int dni;
        float horasTrabajadas;
        float valorPorHora;
    
    
        public Empleado(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
            this.nombre = nombre;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }
        public int clave() {
            return this.dni;
        }
    
        public float valor() {
            return this.horasTrabajadas * this.valorPorHora;
        }
    }
