package edu.umss.fcyt.TourismRestAPI.module.modelo;

import sun.util.calendar.BaseCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Turista {
    @Id

    private Long idturista;
    private Long idagencia;
    private String nombreturista;
    private String apellidoturista;
    private Date fechanacturista;
    private String correoturista;
    private String telefonoturista;
    private String whastappturista;
    private String loginturista;
    private String passturista;

    public Turista(){}
    public Turista(Long id,Long idAge,String text,String text2,Date text3,String text4,String text5,String text6,String text7,String text8){
        this.idturista = id;
        this.idagencia = idAge;
        this.nombreturista = text;
        this.apellidoturista = text2;
        this.fechanacturista = text3;
        this.correoturista = text4;
        this.telefonoturista = text5;
        this.whastappturista = text6;
        this.loginturista = text7;
        this.passturista = text8;
    }




    public Long getId() {
        return idturista;
    }
    public Long getIdA() {
        return idagencia;
    }
    public Date getDate() { return fechanacturista; }
    public String getText() { return nombreturista; }
    public String getText2() {
        return apellidoturista;
    }
    public String getText3() {
        return correoturista;
    }
    public String getText4() { return telefonoturista; }
    public String getText5() { return whastappturista; }
    public String getText6() { return loginturista; }
    public String getText7() { return passturista; }



    public void setNombretu(String s){
        nombreturista =s;
    }
    public void setApellidotu(String s2){
        apellidoturista =s2;
    }
    public void setFechatu(Date s3){
        fechanacturista =s3;
    }
    public void setCorreotu(String s4){
        correoturista =s4;
    }
    public void setTeleftu(String s5){
        telefonoturista =s5;
    }
    public void setWhatsapptu(String s6) {
        whastappturista = s6;
    }
    public void setLogtu(String s7){
        loginturista=s7;
    }
    public void setPasstu(String s8){
        passturista =s8;
    }

}


