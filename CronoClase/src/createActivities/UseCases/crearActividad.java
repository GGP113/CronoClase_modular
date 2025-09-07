package createActivities.UseCases;
import java.time.LocalDate;
import java.util.ArrayList;


import createActivities.Models.*;

public class crearActividad {


    private ArrayList<Actividades> listaAactividades;


    public crearActividad() {
        this.listaAactividades = new ArrayList<Actividades>();
    }


    



    public void create(String titulo, LocalDate fechaEntrega, String estado, Materia materia ){

        Actividades actividad = new Actividades(titulo, fechaEntrega, estado, materia);
        this.listaAactividades.add(actividad);


    }


    public ArrayList<Actividades> getListaAactividades() {
        return new ArrayList<Actividades>(this.listaAactividades);
        
        
    }

    public String toString() {
        
        for(int i=0; i< this.listaAactividades.size(); i++){

            System.out.println(this.listaAactividades.get(i));
            System.out.println("\n");

            
            }

        return "";
        
    }

    






    







    


    
}





/*
 *     public Actividades crearActividad(String titulo, String descripcion, LocalDateTime fechaEntrega, String estado, String tipo, String materia){

         Scanner sc = new Scanner(System.in);
         System.out.print("Ingrese el nombre de la actividad: ");
         String nombreActividad = sc.nextLine();


         System.out.print("Ingrese la descripcion de la actividad: ");
         String descActividad = sc.nextLine();

         System.out.print("Ingrese la fecha de entrega la actividad (YYYY-MM-DD): ");
         String fechaDeEntrega = sc.nextLine();
         LocalDateTime fecha = LocalDateTime.parse(fechaDeEntrega);

         System.out.print("Ingrese el tipo de actividad: ");
         String tipoActividad = sc.nextLine();



        return new Actividades(nombreActividad, descActividad, fecha, "Asignada", tipoActividad, materia);

    }
 * 
 * 
 * 
 * 
 * 
 * 
*/
