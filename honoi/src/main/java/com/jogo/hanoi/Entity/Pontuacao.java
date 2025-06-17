package com.jogo.hanoi.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
public class Pontuacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome_jogador;

    @Column(nullable = false)
    private Integer discos;

    @Column(nullable = false)
    private Integer movimentos;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime data;
}
