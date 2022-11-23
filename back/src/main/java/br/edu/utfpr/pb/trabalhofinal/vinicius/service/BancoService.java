package br.edu.utfpr.pb.trabalhofinal.vinicius.service;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Banco;
import org.springframework.stereotype.Service;

@Service //indicar que está mantendo a lógica de negócios
public interface BancoService extends CrudService<Banco, Long> {
}
