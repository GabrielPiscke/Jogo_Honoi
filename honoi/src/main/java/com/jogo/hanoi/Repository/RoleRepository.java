package com.jogo.hanoi.Repository;

import com.jogo.hanoi.Entity.ERole;
import com.jogo.hanoi.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByNome(ERole nome);
}

