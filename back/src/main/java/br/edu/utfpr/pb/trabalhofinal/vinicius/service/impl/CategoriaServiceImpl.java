package br.edu.utfpr.pb.trabalhofinal.vinicius.service.impl;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Categoria;
import br.edu.utfpr.pb.trabalhofinal.vinicius.repository.CategoriaRepository;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.CategoriaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends CrudServiceImpl<Categoria, Long>
        implements CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected JpaRepository<Categoria, Long> getRepository() {
        return this.categoriaRepository;
    }
}
