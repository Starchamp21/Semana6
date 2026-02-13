package aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Actividad> actividades = new ArrayList<>();

        actividades.add(new Actividad(1, 4));
        actividades.add(new Actividad(3, 5));
        actividades.add(new Actividad(0, 6));
        actividades.add(new Actividad(5, 7));
        actividades.add(new Actividad(8, 9));
        actividades.add(new Actividad(5, 9));

        List<Actividad> resultado = Planificador.seleccionarActividades(actividades);

        System.out.println("Actividades seleccionadas:");
        for (Actividad a : resultado) {
            System.out.println(a);
        }

        System.out.println("Total seleccionadas: " + resultado.size());
    }
}