package modelos;

import java.util.ArrayList;

public class Ayudante {
    Persona per;
    protected Estudiante est;
    public ArrayList<Paralelo> paralelos;
    
    Ayudante(Estudiante e){
    	est = e;
    }
    public String getMatricula() {
        return est.getMatricula();
    }

    public void setMatricula(String matricula) {
        est.setMatricula(matricula);
    }

    //Getters y setters se delegan en objeto estudiante para no duplicar código
    public String getNombre() {
        return per.getNombre();
    }

    public String getApellido() {
        return per.getApellido();
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    
    public void ImprimirParalelosDelAyudante(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
