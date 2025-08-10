package Models;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.Actividades;

public class Momento {

    private String name;

    private ArrayList<Actividades> listaActividades;
    
    private LocalDate date;



    public Momento(String name, ArrayList<Actividades> listaActividades, LocalDate date) {
        this.name = name;
        this.listaActividades = new ArrayList<Actividades>(listaActividades);
        this.date = date;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Actividades> getListaActividades() {
        return new ArrayList<Actividades>(this.listaActividades);
    }

    public void setListaActividades(ArrayList<Actividades> listaActividades) {
        this.listaActividades = new ArrayList<Actividades>(listaActividades);
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }





    

    



    





    

    
    
}
