package createActivities.Models;

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

    public String toString() {

        System.out.println("\t " + this.name);
        //System.out.println("\n");
        System.out.println("\t \t Actividades asignadas: ");

        if (this.listaActividades.size() == 0) {

            System.out.println("\t \t Sin Actividades");
        }

        else {

            for (int i = 0; i < this.listaActividades.size(); i++) {
                
                System.out.println("\t \t"+this.listaActividades.get(i));
                System.out.println("\n");
            }
        }

        System.out.println("\t \t El momento " + this.name + " finaliza el " + this.date);

        return "";

    }

}
