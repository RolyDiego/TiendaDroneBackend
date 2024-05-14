package com.rdiego.tiendaDrone.repository;

import com.rdiego.tiendaDrone.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto,Long> {
}
