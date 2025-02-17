package com.rdiego.tiendaDrone.repository;
import com.rdiego.tiendaDrone.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuariosRepository extends MongoRepository<Usuario, Long> {
    //Método para poder buscar un usuario mediante su nombre
    Optional<Usuario> findByUsername(String username);

    //Método para poder verificar si un usuario existe en nuestra base de datos
    Boolean existsByUsername(String username);
}
