package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;


import br.edu.utfpr.pb.trabalhofinal.vinicius.dto.MovimentacaoDto;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Movimentacao;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CrudService;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.MovimentacaoService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movimentacoes")
public class MovimentacaoController extends CrudController<Movimentacao, MovimentacaoDto, Long>{

    private final MovimentacaoService movimentacaoService;
    private final ModelMapper modelMapper;

    public MovimentacaoController(MovimentacaoService movimentacaoService, ModelMapper modelMapper) {
        super(Movimentacao.class, MovimentacaoDto.class);
        this.movimentacaoService = movimentacaoService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudService<Movimentacao, Long> getService() {
        return this.movimentacaoService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
