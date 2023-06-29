import java.util.ArrayList;

public class Carrera {

    private String nombre;
    private ArrayList<Ramo> ramos;

    public Carrera(String n){
        this.nombre = n;
    }
    public void addnewRamo(Ramo s){
        ramos.add(s);
    }
}
