package com.jogo.hanoi.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PontuacaoDto {
    private String nome_jogador;
    private Integer discos;
    private Integer movimentos;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime data;
}
