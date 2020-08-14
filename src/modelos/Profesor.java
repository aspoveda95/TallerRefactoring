package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    protected String codigo;
    protected int añosdeTrabajo;
    protected String facultad;
    protected double BonoFijo;
    protected ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, ArrayList<Paralelo> paralelos, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(nombre, apellido, edad, direccion, telefono);
        this.codigo = codigo;
        this.paralelos = paralelos;
    }

    public Profesor(String codigo, int añosdeTrabajo, String facultad, double BonoFijo, ArrayList<Paralelo> paralelos, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(nombre, apellido, edad, direccion, telefono);
        this.codigo = codigo;
        this.añosdeTrabajo = añosdeTrabajo;
        this.facultad = facultad;
        this.BonoFijo = BonoFijo;
        this.paralelos = paralelos;
    }
    
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.añosdeTrabajo*600 + prof.BonoFijo;
        return sueldo;
    }  
}
