package cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="producto")
@Data

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;

    @Column(name = "nomproducto")
    private String nomproducto;

    @Column(name = "precio")
    private Double precio;
}