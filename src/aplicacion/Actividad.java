package aplicacion;

public class Actividad {

    private int inicio;
    private int fin;

    public Actividad(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return "(" + inicio + ", " + fin + ")";
    }
}