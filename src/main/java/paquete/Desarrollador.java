package paquete;

import java.util.List;

public class Desarrollador extends Empleado implements evaluarDesempeno{
    private List<String> lenguajes;

    public Desarrollador(int id, String nombre, String departamento, float salario, List<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.printf(", lenguajes=%s\n",String.join(", ", lenguajes));
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
        return (lenguajes.size()>=5)?Desempenio.BUENO
                :(lenguajes.size()>=3)?Desempenio.REGULAR
                :Desempenio.MALO;
    }
}
