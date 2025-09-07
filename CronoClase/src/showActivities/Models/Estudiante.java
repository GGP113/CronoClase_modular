package Models;



import java.util.ArrayList;

import createActivities.Models.Materia;

public class Estudiante {

     private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private ArrayList<Materia> materias;
    private int semestre;



    public Estudiante(String id, String nombre, String apellido, String correo, String carrera, ArrayList<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.materias = new ArrayList<Materia>(materias);
    }

    public Estudiante(int semestre){

        this.semestre = semestre;
    }



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Materia> getMaterias() {
        return new ArrayList<Materia>(this.materias);
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = new ArrayList<Materia>(materias);
    }



    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void VisualizarMaterias(){

        for(Materia m: this.materias){

            System.out.println(m);
        }


    }

}
