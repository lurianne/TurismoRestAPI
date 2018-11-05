package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.Package;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.PackageRepositorio;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//solicitar desde angular
//crossorigin

@RestController
@RequestMapping(path="/package")

public class PackageControlador {
    @Autowired
    private PackageRepositorio packageRepositorio;
    //@RequestMapping(method = GET, path = "/get")
    @GetMapping(path="/get")
    public Iterable<Package> getPackage(){
        return packageRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Package ingresar(@RequestBody Package package2){
        return packageRepositorio.save(package2);
    }
}
