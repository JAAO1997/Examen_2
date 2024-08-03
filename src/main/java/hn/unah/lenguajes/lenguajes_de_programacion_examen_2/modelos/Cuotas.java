package hn.unah.lenguajes.lenguajes_de_programacion_examen_2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cuotas")
@Data
public class Cuotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoCuota")
    private long codigoCuota;

    private long mes;

    private double interes;

    private double capital;

    private double saldo;

    private long codigoPrestamo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="prestamos", referencedColumnName = "codigoPrestamo")
    private Prestamos prestamos;
    
}
