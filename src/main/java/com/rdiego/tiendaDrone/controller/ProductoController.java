package com.rdiego.tiendaDrone.controller;
import com.rdiego.tiendaDrone.models.Producto;
import com.rdiego.tiendaDrone.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.Optional;

@RestController
@RequestMapping("/api/producto/")
public class ProductoController {
    private ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService)
    {
        this.productoService = productoService;
    }

    //Petición para crear un  producto
    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearProducto(@RequestBody Producto producto)
    {
        productoService.createProducto(producto);
    }

    //Petición para obtener todos los producto en la BD
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Producto> listarProductos() {
        return productoService.getAllProductos();
    }

    //Petición para obtener producto mediante "ID"
    @GetMapping(value = "listId/{id}", headers = "Accept=application/json")
    public Optional<Producto> obtenerProductoPorId(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }

    //Petición para actualizar un celular
    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);
    }

    //Petición para eliminar un producto por "Id"
    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }
}

