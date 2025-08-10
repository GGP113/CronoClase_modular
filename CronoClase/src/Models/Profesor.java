package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Models.*;



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



    
}
