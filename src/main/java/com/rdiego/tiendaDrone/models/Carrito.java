package com.rdiego.tiendaDrone.models;
import com.fasterxml.jackson.annotation.JsonProperty;
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
//@Entity
//@Table(name = "tbl_curso")
@Document(collection = "carrito")
public class Carrito {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int cantidad;
    private float total;
    private int comision;
   // private Long id_producto; //fk llave foranea

//    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Producto.class)
//    private Producto producto;

    @OneToMany(mappedBy = "carrito", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Producto.class)
    private List<Producto> productosList;


}

