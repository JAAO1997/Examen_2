package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Clientes;

@Repository
public interface ClientesRepositorio extends JpaRepository<Clientes, String>{
    
}
