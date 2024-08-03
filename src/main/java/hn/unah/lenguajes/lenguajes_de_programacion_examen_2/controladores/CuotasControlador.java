package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.servicios.CuotasServicio;

@RestController
@RequestMapping("/api/cuotas")
public class CuotasControlador {

    @Autowired
    private CuotasServicio cuotasServicio;
    
}
