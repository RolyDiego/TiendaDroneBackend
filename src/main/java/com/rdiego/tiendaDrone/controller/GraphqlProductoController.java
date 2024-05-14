package com.rdiego.tiendaDrone.controller;

import com.rdiego.tiendaDrone.models.Producto;
import com.rdiego.tiendaDrone.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
//@RequestMapping("/api/graphql/producto/")
public class GraphqlProductoController {
    @Autowired
    private ProductoService productoService;

    @QueryMapping(name = "findProductoById")
    public Optional<Producto> findById(@Argument(name = "productoId") String id){
        Long productoId = Long.parseLong(id);
        return productoService.getProductoById(productoId);
    }

}
