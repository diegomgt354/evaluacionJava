package paquete;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Empleado {

    private int id;
    private String nombre;
    private String departamento;
    private float salario;

    public void mostrarDetalles(){
        System.out.printf("id=%d, nombre=%s,departamento=%s,salario=%s"
                ,id, nombre, departamento, salario);
    }

    public abstract float calcularBono();
}
