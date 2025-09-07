package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Models.*;
import java.util.Scanner;

import UseCases.*;

public class Profesor {

    private String name;
    private String email;
    private String programa;

    public Profesor(String name, String email, String programa) {
        this.name = name;
        this.email = email;
        this.programa = programa;

    }

    public Profesor(Profesor source) {
        this.name = source.name;
        this.email = source.email;
        this.programa = programa;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void AsignarActividades(Materia materiaElegida) {

        boolean trigger = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas actividades desea ingresar: ");
        int numActividades = sc.nextInt();
        sc.nextLine();

        System.out.print("En cual de los momentos desea cargar actividades: ");
        int momentoElegido = sc.nextInt();
        sc.nextLine();
        Momento momentoSeleccionado = materiaElegida.getMomentos().get(momentoElegido - 1);

        crearActividad actividadesNuevas = new crearActividad();

        for (int i = 0; i < numActividades; i++) {

            trigger=true;

            System.out.print("Ingrese la tarea # " + (i + 1));
            System.out.println("\n");

            System.out.print("Ingrese el nombre de la actividad: ");
            String nombreActividad = sc.nextLine();

            while (trigger) {

                try {

                    System.out.print("Ingrese la fecha de entrega la actividad (YYYY-MM-DD): ");
                    String fechaDeEntrega = sc.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaDeEntrega);
                    actividadesNuevas.create(nombreActividad, fecha, "asignada", materiaElegida);

                    System.out.println("\n");
                    trigger=false;

                }

                catch (Exception e) {
                    // TODO: handle exception

                    System.out.println("Ingrese la forma en el formato correcto");
                    
                }

            }


            // materiaElegida.getMomentos().get(momentoElegido).setListaActividades(actividadesNuevas.getListaActividades());

        }

        System.out.println("Las actividades asignadas fueron: " + "\n");
        System.out.println(actividadesNuevas);
        materiaElegida.getMomentos().get(momentoElegido - 1)
                .setListaActividades(actividadesNuevas.getListaAactividades());

    }

}
