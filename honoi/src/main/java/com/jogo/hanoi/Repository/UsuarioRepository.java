package com.jogo.hanoi.Repository;


import com.jogo.hanoi.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        Optional<Usuario> findByNome(String nome);
        Boolean existsByNome(String nome);
        Boolean existsByEmail(String email);
}

