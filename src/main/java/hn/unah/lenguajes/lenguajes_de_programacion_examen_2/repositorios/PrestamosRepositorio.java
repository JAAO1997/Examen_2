package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Prestamos;

@Repository
public interface PrestamosRepositorio extends JpaRepository<Prestamos, Long>{
    
}
