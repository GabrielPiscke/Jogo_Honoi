package com.jogo.hanoi.Controller;

import com.jogo.hanoi.Dto.PontuacaoDto;
import com.jogo.hanoi.Service.PontuacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pontuacao")
@RequiredArgsConstructor
public class PontuacaoController {


        private PontuacaoService pontuacaoservice;

        @GetMapping
        public ResponseEntity<List<PontuacaoDto>> getTopScores() {
            return ResponseEntity.ok(pontuacaoservice.getTopPontuacao());
        }

        @PostMapping
        public ResponseEntity<PontuacaoDto> saveScore(@RequestBody PontuacaoDto scoreDTO) {
            return ResponseEntity.ok(pontuacaoservice.savePontuacao(scoreDTO));
        }
}

