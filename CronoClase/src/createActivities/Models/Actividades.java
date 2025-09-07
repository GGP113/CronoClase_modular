package createActivities.Models;

import java.time.LocalDate;

public class Actividades {

    private String titulo;
 
    private LocalDate fechaEntrega; // Cambiado a LocalDate
    private String estado;

    private Materia materia;


    public Actividades(String titulo, LocalDate fechaEntrega, String estado, Materia materia) {
        this.titulo = titulo;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.materia = materia;
    }




    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaEntrega() {
        return this.fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Materia getMateria() {
        return this.materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }


    public String toString() {
        return "Nombre de la actividad: "+this.titulo + "\n"
        + "\t \t Fecha de entrega: " + this.fechaEntrega + "\n"
        + "\t \t Estado: " + this.estado + "\n"
        + "\t \t Materia: " + this.materia.getName() + "\n";
    }



    
}
