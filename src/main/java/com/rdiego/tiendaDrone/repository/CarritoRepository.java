package com.rdiego.tiendaDrone.repository;

import com.rdiego.tiendaDrone.models.Carrito;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends MongoRepository<Carrito,Long> {
}
