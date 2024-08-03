package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Clientes;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.servicios.ClientesServicio;

@RestController
@RequestMapping("/api/clientes")
public class ClientesControlador {

    @Autowired
    private ClientesServicio clientesServicio;

    @GetMapping("/obtener/todos")
    public List<Clientes> obtenerTodos() {
        return this.clientesServicio.obtenerTodos();
    }

    @PostMapping("/crear/nuevo")
    public Clientes crearClientes(@RequestBody Clientes nvClientes) {
        return this.clientesServicio.crearNuevoClientes(nvClientes);
    }
    
    

    
    
}
