package edu.umss.fcyt.TourismRestAPI.module.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "\"PACKAGE\"")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Package{
    @Id
    @Column(name = "\"packageId\"")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "\"minimunGroup\"")
    private Long minimo;
    @Column(name = "name")
    private String nombre;
    @Column(name = "description")
    private String descripcion;
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "inversion")
    private Long inversion;
    @ManyToOne
    @JoinColumn(name ="\"categoryId\"")
    private Categoria categoria;
    @OneToMany(mappedBy = "paquete")
    private List<Reserva> reservas;

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMinimo() {
        return minimo;
    }

    public void setMinimo(Long minimo) {
        this.minimo = minimo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria idCategoria) {
        this.categoria = idCategoria;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Long getInversion() {
        return inversion;
    }

    public void setInversion(Long inversion) {
        this.inversion = inversion;
    }
}
