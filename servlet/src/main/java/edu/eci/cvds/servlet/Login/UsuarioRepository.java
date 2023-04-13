package edu.eci.cvds.servlet.Login;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsById(String userId);

    Usuario findById(String userId);
}
