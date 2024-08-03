package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="prestamos")
@Data
public class Prestamos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoPrestamo")
    private long codigoPrestamo;
    
    private LocalDate fechaApertura;
    
    private double monto;
    
    private double cuota;

    private long plazo;

    private double interes;

    private String dni;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="cliente", referencedColumnName = "dni")
    private Clientes clientes;

    @OneToMany(mappedBy = "cuotas", cascade = CascadeType.ALL)
    private Cuotas cuotas;
    
}
