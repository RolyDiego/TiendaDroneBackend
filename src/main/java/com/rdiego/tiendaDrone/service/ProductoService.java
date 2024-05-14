package com.rdiego.tiendaDrone.service;

import com.rdiego.tiendaDrone.models.Producto;
import com.rdiego.tiendaDrone.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return  productoRepository.findAll();
    }

    public Optional<Producto> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

    public Producto createProducto(Producto producto) {
//        Long  a = producto.getId();
//        String b = producto.getNombre();
//        float c = producto.getPrecio();
//        System.out.println("===  Producto id-->> "+a+" nombre; "+b+" Precio: "+c);
        return productoRepository.save(producto);
    }

    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }
}

