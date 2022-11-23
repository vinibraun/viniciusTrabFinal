package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;

import br.edu.utfpr.pb.trabalhofinal.vinicius.dto.BancoDto;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Banco;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.BancoService;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //retorna o objeto e os dados do objeto são gravados diretamente na resposta HTTP
@RequestMapping("bancos") //é usada para mapear URLs como www
public class BancoController extends CrudController<Banco, BancoDto, Long>{

    private final BancoService bancoService;
    private final ModelMapper modelMapper;

    public BancoController(BancoService bancoService, ModelMapper modelMapper) {
        super(Banco.class, BancoDto.class);
        this.bancoService = bancoService;
        this.modelMapper = modelMapper;
    }


    @Override
    protected CrudService<Banco, Long> getService() {
        return this.bancoService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
