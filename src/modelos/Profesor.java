package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    Persona persona;
    
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String facultad,String direccion, String telefono, Persona persona) {
        this.codigo = codigo;    
        
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    
}
