public class Ramo {
    private int semestre;
    private Boolean pasado;
    private String nombre;

    public Ramo(int semestre, String nombre, Boolean pasado) {
        this.semestre = semestre;
        this.nombre = nombre;
        this.pasado = pasado;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int toInt() {
        if (this.pasado){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return  semestre + " " + pasado + " " + nombre;
    }
}
