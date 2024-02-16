
package Registro;

import java.util.Date;


public class tramites {
    
    private String nameTrami;
    private String descripcion;
    private Date fechaSoli;
    private String identidad;

    public tramites(String nameTrami, String descripcion, Date fechaSoli, String identidad) {
        this.nameTrami = nameTrami;
        this.descripcion = descripcion;
        this.fechaSoli = fechaSoli;
        this.identidad = identidad;
    }

    public String getNameTrami() {
        return nameTrami;
    }

    public void setNameTrami(String nameTrami) {
        this.nameTrami = nameTrami;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSoli() {
        return fechaSoli;
    }

    public void setFechaSoli(Date fechaSoli) {
        this.fechaSoli = fechaSoli;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "tramites{" + "nameTrami=" + nameTrami + ", descripcion=" + descripcion + ", fechaSoli=" + fechaSoli + ", identidad=" + identidad + '}';
    }
    
    
    
}
