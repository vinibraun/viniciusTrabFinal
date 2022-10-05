package br.edu.utfpr.pb.trabalhofinal.vinicius.service.impl;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Conta;
import br.edu.utfpr.pb.trabalhofinal.vinicius.repository.ContaRepository;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.ContaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl extends CrudServiceImpl<Conta, Long>
        implements ContaService {

    private ContaRepository contaRepository;

    public ContaServiceImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    protected JpaRepository<Conta, Long> getRepository() {
        return this.contaRepository;
    }
}
