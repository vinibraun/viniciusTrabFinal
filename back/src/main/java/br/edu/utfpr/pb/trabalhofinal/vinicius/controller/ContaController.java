package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;


import br.edu.utfpr.pb.trabalhofinal.vinicius.dto.ContaDto;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Conta;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.ContaService;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contas")
public class ContaController extends CrudController<Conta, ContaDto, Long> {

    private final ContaService contaService;
    private final ModelMapper modelMapper; //que isso?

    public ContaController(ContaService contaService, ModelMapper modelMapper) {
        super(Conta.class, ContaDto.class);
        this.contaService = contaService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudService<Conta, Long> getService() {
        return this.contaService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
