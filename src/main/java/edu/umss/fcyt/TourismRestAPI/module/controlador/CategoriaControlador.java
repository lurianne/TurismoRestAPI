package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.Categoria;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@RestController
@RequestMapping(path="/categoria")
public class CategoriaControlador {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @RequestMapping(path="/get", method= GET )
    public Iterable<Categoria> getClase(){

        return categoriaRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Categoria ingresar(@RequestBody Categoria clase){
        return categoriaRepositorio.save(clase);
    }

}
