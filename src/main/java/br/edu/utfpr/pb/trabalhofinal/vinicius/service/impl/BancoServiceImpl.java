package br.edu.utfpr.pb.trabalhofinal.vinicius.service.impl;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Banco;
import br.edu.utfpr.pb.trabalhofinal.vinicius.repository.BancoRepository;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.BancoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BancoServiceImpl extends CrudServiceImpl<Banco, Long>
    implements BancoService {

    private BancoRepository bancoRepository;

    public BancoServiceImpl(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    @Override
    protected JpaRepository<Banco, Long> getRepository() {
        return this.bancoRepository;
    }
}
