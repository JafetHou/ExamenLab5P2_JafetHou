
package Registro;

import java.util.Date;


public class empleados extends Personas{
    
    private String carrera;
    private String puesto;
    private int anios;

    public empleados() {
    }

    public empleados(String carrera, String puesto, int anios) {
        this.carrera = carrera;
        this.puesto = puesto;
        this.anios = anios;
    }

    public empleados(String carrera, String puesto, int anios, String nombre, String apellido, String contra, Date fecha, String sexo, String depa, String identidad) {
        super(nombre, apellido, contra, fecha, sexo, depa, identidad);
        this.carrera = carrera;
        this.puesto = puesto;
        this.anios = anios;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    
}
