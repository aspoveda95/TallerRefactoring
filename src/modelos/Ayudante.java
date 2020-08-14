package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    protected ArrayList<Paralelo> paralelosAyudante;
    
    public Ayudante(String matricula, String facultad, ArrayList<Paralelo> paralelos, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(matricula, facultad, paralelos, nombre, apellido, edad, direccion, telefono);
        this.paralelosAyudante = new ArrayList<Paralelo>();
    }

    public void ImprimirParalelosDelAyudante(){
        for(Paralelo par:paralelosAyudante){
            //Muestra la info general de cada paralelo
        }
    }
}
