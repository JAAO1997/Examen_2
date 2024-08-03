package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Prestamos;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.servicios.PrestamosServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/prestamos")
public class PrestamosControlador {
   
    @Autowired
    private PrestamosServicio prestamosServicio;

    @PostMapping("/prestamos/nuevo/{dni}")
    public Prestamos nuevPrestamos(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}
