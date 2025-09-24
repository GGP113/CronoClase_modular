package createActivities.controllers;

import UseCases.*;
import createActivities.Models.Actividades;
import createActivities.Models.Materia;
import createActivities.UseCases.crearActividad;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.*;

public class createActivitiesController {

    public crearActividad crearActividadUseCase;

    public createActivitiesController(){

        this.crearActividadUseCase  = new crearActividad();


    }


    public void create(String titulo, LocalDate fechaEntrega, String estado, Materia materia ){

        this.crearActividadUseCase.create(titulo,fechaEntrega, estado, materia);



    }


     public ArrayList<Actividades> getListaAactividades(){

        return this.crearActividadUseCase.getListaAactividades();


     }

     public String toString(){

        return this.crearActividadUseCase.toString();


     }








    



    
}
