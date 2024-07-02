package proxy;

import builder.Pessoa;
import proxy.solucao.PessoaRepositoryProxy;

public class PessoaService {

    private PessoaRepositoryProxy pessoaRepositoyProxy;

    public PessoaService(PessoaRepositoryProxy pessoaRepositoyProxy) {
        this.pessoaRepositoyProxy = pessoaRepositoyProxy;
    }

    public void save(Pessoa pessoa) {
        pessoaRepositoyProxy.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return pessoaRepositoyProxy.findById(id);
    }
}
