package edu.umss.fcyt.TourismRestAPI.module.modelo;

import javax.persistence.*;

@Entity
@Table(name = "\"PACKAGE\"")
public class Package{
    @Id
    @Column(name = "\"packageId\"")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long packageId;
    private Long minimunGroup;
    private Long categoryId;
    private String name;
    private String description;
    private String keywords;
    private Long inversion;

    public Package () {}
    public Package(Long id ,Long miniG ,Long idCateg,String text1,String text2,String  text3,Long invers){
        this.packageId = id;
        this.minimunGroup = miniG;
        this.categoryId = idCateg;
        this.name = text1;
        this.description = text2;
        this.keywords = text3;
        this.inversion = invers;
    }

    public Long getId(){
        return packageId;
    }
    public Long getMiniG (){
        return minimunGroup;
    }
    public Long getIdCateg(){
        return categoryId;
    }
    public String getText1(){
        return name;
    }
    public String getText2(){
        return description;
    }
    public String getText3(){
        return keywords;
    }
    public Long getInvers(){
        return inversion;
    }


    public void setMinimunGroup(Long grupoMin ){
        minimunGroup = grupoMin;
    }
    public void setName (String nombre ){
        name = nombre;
    }
    public void setDescription(String descripcion ){
        description = descripcion;
    }
    public void setKeywords(String clave){
        keywords = clave;
    }
    public void setInversion (Long inversi ){
        inversion= inversi;
    }

}
