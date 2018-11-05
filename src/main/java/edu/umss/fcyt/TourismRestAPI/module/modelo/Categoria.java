package edu.umss.fcyt.TourismRestAPI.module.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;

@Entity
@Table(name = "\"CATEGORY\"")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Categoria {
    @Id
    @Column(name = "\"categoryId\"")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "description")
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
