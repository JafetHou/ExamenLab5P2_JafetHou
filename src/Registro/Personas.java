
package Registro;

import java.util.Date;
import java.util.Random;


public class Personas {
    
    static Random ran = new Random();
    
    private String nombre;
    private String apellido;
    private String contra;
    private Date fecha;
    private String sexo;
    private String depa;
    private String identidad;

    public Personas() {
    }

    public Personas(String nombre, String apellido, String contra, Date fecha, String sexo, String depa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha = fecha;
        this.sexo = sexo;
        this.depa = depa;
    }

    public Personas(String nombre, String apellido, String contra, Date fecha, String sexo, String depa, String identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha = fecha;
        this.sexo = sexo;
        this.depa = depa;
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepa() {
        return depa;
    }

    public void setDepa(String depa) {
        this.depa = depa;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad();
    }

    @Override
    public String toString() {
        return "Personas " + "nombre: " + nombre + ", apellido: " + apellido + ", contra: " + contra + ", fecha: " + fecha + ", sexo: " + sexo + ", departamento: " + depa + ", identidad: " + identidad + '}';
    }
    
    public String identidad(){
        
        String id = "";
        
        if(depa.equalsIgnoreCase("Francisco Morazan")){
            
            int fran = 1+ran.nextInt(28);
            int random = 1000+ran.nextInt(9999);
            id = "01"+fran+"-"+fecha.getYear()+"-"+random;
            return id;
            
        }else if(depa.equalsIgnoreCase("Cortes")){
            
            int cort = 1+ran.nextInt(12);
            int random = 1000+ran.nextInt(9999);
            id = "01"+cort+"-"+fecha.getYear()+"-"+random;
            return id;
            
        }else if(depa.equalsIgnoreCase("Comayagua")){
            
            int coma = 1+ran.nextInt(21);
            int random = 1000+ran.nextInt(9999);
            id = "01"+coma+"-"+fecha.getYear()+"-"+random;
            return id;
        }
        return id;
    }
    
    
}
