package com.jogo.hanoi.Service;

import com.jogo.hanoi.Dto.PontuacaoDto;
import com.jogo.hanoi.Entity.Pontuacao;
import com.jogo.hanoi.Repository.PontuacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PontuacaoService {
    @Autowired
    private PontuacaoRepository pontuacaoRepository;

    @Autowired
    private  ModelMapper modelMapper;

    public List<PontuacaoDto> getTopPontuacao() {
        return pontuacaoRepository.findTopScores().stream()
                .map(pontuacao -> modelMapper.map(pontuacao, PontuacaoDto.class))
                .collect(Collectors.toList());
    }

    public PontuacaoDto savePontuacao(PontuacaoDto pontuacaoDTO) {
        Pontuacao pontuacao = modelMapper.map(pontuacaoDTO, Pontuacao.class);
        Pontuacao savePontuacao = pontuacaoRepository.save(pontuacao);
        return modelMapper.map(savePontuacao, PontuacaoDto.class);
    }
}
