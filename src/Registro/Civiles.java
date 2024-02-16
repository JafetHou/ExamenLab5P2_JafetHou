
package Registro;

import java.util.ArrayList;
import java.util.Date;

public class Civiles extends Personas{
    
    private ArrayList <tramites> trami = new ArrayList<>();

    public Civiles() {
    }

    
    
    public Civiles(String nombre, String apellido, String contra, Date fecha, String sexo, String depa) {
        super(nombre, apellido, contra, fecha, sexo, depa);
    }

    
    
    public ArrayList<tramites> getTrami() {
        return trami;
    }

    public void setTrami(ArrayList<tramites> trami) {
        this.trami = trami;
    }

    @Override
    public String toString() {
        return "Civiles{" + "trami:" + trami + '}';
    }
    
    
}
