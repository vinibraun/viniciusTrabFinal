package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;

import br.edu.utfpr.pb.trabalhofinal.vinicius.dto.BancoDto;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Banco;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.BancoService;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bancos")
public class BancoController extends CrudController<Banco, BancoDto, Long>{

    private final BancoService bancoService;
    private final ModelMapper modelMapper;

//    public BancoController(Class<Banco> typeClass, Class<BancoDto> typeDtoClass, BancoService bancoService, ModelMapper modelMapper) {
//        super(typeClass, typeDtoClass);
//        this.bancoService = bancoService;
//        this.modelMapper = modelMapper;
//    }

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
