package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;

import br.edu.utfpr.pb.trabalhofinal.vinicius.dto.TipoMovimentacaoDto;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.TipoMovimentacao;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CrudService;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.TipoMovimentacaoService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tipos")
public class TipoMovimentacaoController extends CrudController<TipoMovimentacao, TipoMovimentacaoDto, Long>{

    private final TipoMovimentacaoService tipoMovimentacaoService;
    private final ModelMapper modelMapper;

    public TipoMovimentacaoController(TipoMovimentacaoService tipoMovimentacaoService, ModelMapper modelMapper) {
        super(TipoMovimentacao.class, TipoMovimentacaoDto.class);
        this.tipoMovimentacaoService = tipoMovimentacaoService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudService<TipoMovimentacao, Long> getService() {
        return this.tipoMovimentacaoService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
