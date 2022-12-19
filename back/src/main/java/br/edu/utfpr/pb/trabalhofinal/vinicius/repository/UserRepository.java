package br.edu.utfpr.pb.trabalhofinal.vinicius.repository;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
