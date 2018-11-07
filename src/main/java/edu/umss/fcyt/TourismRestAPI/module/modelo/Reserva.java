package edu.umss.fcyt.TourismRestAPI.module.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Reserva {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( name ="idreserva")
    private Long id;
    private String fecha;
    private Long metodoPago;
    @ManyToOne
    @JoinColumn(name="idreservador")
    private Turista turista;
    @ManyToOne
    @JoinColumn(name="\"idPackage\"")
    private Package paquete;;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Long metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Package getPaquete() {
        return paquete;
    }

    public void setPaquete(Package paquete) {
        this.paquete = paquete;
    }
}
