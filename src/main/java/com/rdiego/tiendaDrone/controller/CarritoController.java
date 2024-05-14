package com.rdiego.tiendaDrone.controller;
import com.rdiego.tiendaDrone.models.Carrito;
import com.rdiego.tiendaDrone.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carrito/")
public class CarritoController {
    private CarritoService carritoService;

    @Autowired
    public CarritoController(CarritoService carritoService)
    {
        this.carritoService = carritoService;
    }

    //Petición para crear un
    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearCarrito(@RequestBody Carrito carrito)
    {
        carritoService.createCarrito(carrito);
    }

    //Petición para obtener todos los  en la BD
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Carrito> listarCarrito() {
        return carritoService.getAllCarritos();
    }

    //Petición para obtener  mediante "ID"
    @GetMapping(value = "listId/{id}", headers = "Accept=application/json")
    public Optional<Carrito> obtenerCarritoPorId(@PathVariable Long id) {
        return carritoService.getCarritoById(id);
    }

    //Petición para actualizar un
    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarCarrito(@RequestBody Carrito carrito) {
        carritoService.createCarrito(carrito);
    }

    //Petición para eliminar un producto por "Id"
    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarCarrito(@PathVariable Long id) {
        carritoService.deleteCarrito(id);
    }
}

