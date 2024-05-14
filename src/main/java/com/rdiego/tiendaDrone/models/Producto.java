package com.rdiego.tiendaDrone.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "producto")
public class Producto {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private float precio;
    //private Long cursoId; // Relación con curso

//    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Carrito.class)
//    private List<Carrito> carritoList;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Carrito.class)
    private Carrito carrito;
}
