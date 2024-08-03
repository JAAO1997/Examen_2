package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Clientes;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Prestamos;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos.Cuotas;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios.ClientesRepositorio;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios.CuotasRepositorio;
import hn.unah.lenguajes.lenguajes_de_programacion_examen_2.repositorios.PrestamosRepositorio;

@Service
public class ClientesServicio {

    @Autowired
    private ClientesRepositorio clientesRepositorio;

    @Autowired
    private PrestamosRepositorio prestamosRepositorio;

    @Autowired
    private CuotasRepositorio cuotasRepositorio;    

    public List<Clientes> obtenerTodos(){
        return this.clientesRepositorio.findAll();
    }

    public Clientes crearNuevoClientes(Clientes nvClientes){
        if(this.clientesRepositorio.existsById(nvClientes.getDni())) {
            return null;
        }

        /*List<Prestamos> prestamos = nvClientes.getPrestamos();
        if(prestamos < 2){
            for(Prestamos prestamos:prestamos){
                prestamo.setClientes(nvClientes);
            }
        }*/

        return this.clientesRepositorio.save(nvClientes);
    }
  


    
}
