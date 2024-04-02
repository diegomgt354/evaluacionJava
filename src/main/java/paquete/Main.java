package paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>  m = Arrays.asList("sd","23");
        List<Empleado> empleados = List.of(
                new Desarrollador(1,"Diego","Lima", 4500, List.of("Java","JavaScript","Python","Kotlin","PHP")),
                new Desarrollador(2,"Cristian","Chiclayo", 7000, List.of("Java","JavaScript","Python")),
                new Desarrollador(3,"Jimmy","Cajamarca", 2450, List.of("Python","Kotlin","PHP")),
                new Desarrollador(4,"Roberto","Arequipa", 8000, List.of("PHP")),
                new Gerente(1,"Fernando","Junin",3500, List.of("Alfredo", "Esteban","Alicia")),
                new Gerente(2,"Alfredo","Amazonas",9000, List.of("Alfredo", "Esteban","Alicia", "Carolina", "Omar")),
                new Gerente(3,"Luis","San Martin",1680, List.of("Alfredo", "Esteban"))
                );

        for(Empleado emp : empleados){
            emp.mostrarDetalles();
            System.out.printf("Bono=%f\n\n",emp.calcularBono());

        }
    }
}
