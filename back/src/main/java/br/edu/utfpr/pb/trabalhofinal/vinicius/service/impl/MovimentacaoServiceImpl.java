package br.edu.utfpr.pb.trabalhofinal.vinicius.service.impl;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Movimentacao;
import br.edu.utfpr.pb.trabalhofinal.vinicius.repository.MovimentacaoRepository;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.MovimentacaoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoServiceImpl extends CrudServiceImpl<Movimentacao, Long>
    implements MovimentacaoService {

    private MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoServiceImpl(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    @Override
    protected JpaRepository<Movimentacao, Long> getRepository() {
        return this.movimentacaoRepository;
    }
}
