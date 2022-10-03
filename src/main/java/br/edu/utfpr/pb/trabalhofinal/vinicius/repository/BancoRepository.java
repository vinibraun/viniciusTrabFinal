package br.edu.utfpr.pb.trabalhofinal.vinicius.repository;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long> {
}
