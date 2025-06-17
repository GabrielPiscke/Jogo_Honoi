package com.jogo.hanoi.Repository;


import com.jogo.hanoi.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        Optional<Usuario> findByUsername(String nome);
        Boolean existsByUsername(String nome);
        Boolean existsByEmail(String email);
}

