package com.jogo.hanoi.Repository;

import com.jogo.hanoi.Entity.Pontuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("/score")
public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long> {
    @Query("SELECT s FROM Score s ORDER BY s.disks DESC, s.moves ASC, s.createdAt DESC")
    List<Pontuacao> findTopScores();
}
