package br.edu.utfpr.pb.trabalhofinal.vinicius.repository;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
