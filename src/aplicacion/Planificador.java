package aplicacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Planificador {

    public static List<Actividad> seleccionarActividades(List<Actividad> actividades) {

        // 1. Ordeno por tiempo de finalización.
        actividades.sort(Comparator.comparingInt(Actividad::getFin));

        List<Actividad> seleccionadas = new ArrayList<>();

        // 2. Selecciono la primera.
        Actividad ultima = actividades.get(0);
        seleccionadas.add(ultima);

        // 3. Recorro el resto.
        for (int i = 1; i < actividades.size(); i++) {
            Actividad actual = actividades.get(i);

            if (actual.getInicio() >= ultima.getFin()) {
                seleccionadas.add(actual);
                ultima = actual;
            }
        }

        return seleccionadas;
    }
}