package br.edu.utfpr.pb.trabalhofinal.vinicius.service.impl;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.TipoMovimentacao;
import br.edu.utfpr.pb.trabalhofinal.vinicius.repository.TipoMovimentacaoRepository;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.TipoMovimentacaoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoMovimentacaoServiceImpl extends CrudServiceImpl<TipoMovimentacao, Long>
        implements TipoMovimentacaoService {

    private TipoMovimentacaoRepository tipoMovimentacaoRepository;

    public TipoMovimentacaoServiceImpl(TipoMovimentacaoRepository tipoMovimentacaoRepository) {
        this.tipoMovimentacaoRepository = tipoMovimentacaoRepository;
    }

    @Override
    protected JpaRepository<TipoMovimentacao, Long> getRepository() {
        return this.tipoMovimentacaoRepository;
    }
}
