package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;

import br.edu.utfpr.pb.trabalhofinal.vinicius.dto.CategoriaDto;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Categoria;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CrudService;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class CategoriaController extends CrudController<Categoria, CategoriaDto, Long>{

    private final CategoriaService categoriaService;
    private final ModelMapper modelMapper;

    public CategoriaController(CategoriaService categoriaService, ModelMapper modelMapper) {
        super(Categoria.class, CategoriaDto.class);
        this.categoriaService = categoriaService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudService<Categoria, Long> getService() {
        return this.categoriaService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
