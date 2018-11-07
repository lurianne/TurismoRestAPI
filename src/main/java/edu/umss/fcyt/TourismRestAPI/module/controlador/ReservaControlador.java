package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.Categoria;
import edu.umss.fcyt.TourismRestAPI.module.modelo.Reserva;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.CategoriaRepositorio;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@RestController
@RequestMapping(path="/reserva")
public class ReservaControlador {
    @Autowired
    private ReservaRepositorio reservaRepositorio;
    @RequestMapping(path="/get", method= GET )
    public Iterable<Reserva> getClase(){

        return reservaRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Reserva ingresar(@RequestBody Reserva clase){
    return reservaRepositorio.save(clase);
    }

}
