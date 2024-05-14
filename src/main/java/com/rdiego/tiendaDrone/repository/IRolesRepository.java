package com.rdiego.tiendaDrone.repository;
import com.rdiego.tiendaDrone.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolesRepository extends MongoRepository<Roles, Long> {
    //Método para buscar un role por su nombre en nuestra base de datos
    Optional<Roles> findByName(String name);
}
