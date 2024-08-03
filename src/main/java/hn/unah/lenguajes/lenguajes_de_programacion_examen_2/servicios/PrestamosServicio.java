package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios.ClientesRepositorio;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios.CuotasRepositorio;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios.PrestamosRepositorio;

@Service
public class PrestamosServicio {

    @Autowired
    private ClientesRepositorio clientesRepositorio;

    @Autowired
    private PrestamosRepositorio prestamosRepositorio;

    @Autowired
    private CuotasRepositorio cuotasRepositorio;
    
}
