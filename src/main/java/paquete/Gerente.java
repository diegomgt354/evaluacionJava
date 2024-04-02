package paquete;

import lombok.AllArgsConstructor;

import java.util.List;

public class Gerente extends Empleado implements evaluarDesempeno{
    List<String> equipo;

    public Gerente(int id, String nombre, String departamento, float salario, List<String> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.printf(", equipo=%s\n",String.join(", ", equipo));
    }

    @Override
    public float calcularBono() {
        Desempenio d = evaluarDesempeno();
        return (d.equals(Desempenio.BUENO))?getSalario()
                :(d.equals(Desempenio.REGULAR))?getSalario()/2
                :0;
    }

    @Override
    public Desempenio evaluarDesempeno() {
        return (equipo.size()>=5)?Desempenio.BUENO
                :(equipo.size()>=3)?Desempenio.REGULAR
                :Desempenio.MALO;
    }
}
