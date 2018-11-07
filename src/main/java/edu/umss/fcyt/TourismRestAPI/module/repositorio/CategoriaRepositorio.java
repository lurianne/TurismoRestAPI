package edu.umss.fcyt.TourismRestAPI.module.repositorio;

import edu.umss.fcyt.TourismRestAPI.module.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepositorio extends CrudRepository<Categoria,Long> {
}
