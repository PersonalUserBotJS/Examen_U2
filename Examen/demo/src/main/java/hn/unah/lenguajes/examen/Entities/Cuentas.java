package hn.unah.lenguajes.examen.Entities;

import java.time.LocalDate;

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
@Table(name = "cuentas")
@Data

public class Cuentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroCuenta")
    private String numeroCuenta;

    private double saldo = 500;
    
    @Column(name="fechaapertura")
    private LocalDate fechaApertura;
    
    private boolean estado = true;
    private boolean sobregiro;

    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name = "idmovimiento", referencedColumnName = "idmovimiento")
    private Movimientos movimientos;

}