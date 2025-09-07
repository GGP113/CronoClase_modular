package createActivities.Models;

import Models.Profesor;
import java.util.ArrayList;
import java.util.Arrays;

import Models.Momento;

public class Materia {

    private String name;
    private Profesor profesor;
    private int semestre;

    private String horario;
    private ArrayList<Momento> momentos;



    public Materia(String name, Profesor profesor, int semestre, String horario, ArrayList<Momento> momentos) {
        this.name = name;
        this.profesor = profesor;
        this.semestre = semestre;
        this.horario = horario;
        this.momentos = new ArrayList<Momento>(momentos);
    }


    public Materia( Materia source){

        this.name = source.name;
        this.profesor = source.profesor;
        this.semestre =source.semestre;
        this.horario =source.horario;
        this.momentos=source.momentos;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Momento> getMomentos() {
        return new ArrayList<Momento>(this.momentos);
    }

    public void setMomentos(ArrayList<Momento> momentos) {
        this.momentos = new ArrayList<Momento>(momentos);
    }


    public String toString(){

        //COMPLETAR AQUI

        System.out.println("Materia: " + this.name);
        System.out.println("Docente: " + this.profesor.getName());
        System.out.println("Horario: " + this.horario);
        System.out.println("Momentos: " );
        
        for(Momento m: this.momentos){

            System.out.println(m);


        }

            return "";
        }


    
}
