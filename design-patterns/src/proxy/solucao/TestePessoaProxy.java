package proxy.solucao;

import java.time.LocalDate;

import builder.Pessoa;
import builder.solucao.PessoaBuilder;
import proxy.PessoaService;

public class TestePessoaProxy {

    public static void main(String[] args) {

        PessoaRepositoryProxy pessoaRepositoyProxy = new PessoaRepositoryProxy();
        PessoaService pesssoaService = new PessoaService(pessoaRepositoyProxy);

        Pessoa pessoa = new PessoaBuilder()
                .nome("Ferreira")
                .sobreNome("Costa")
                .apelido("Danm")
                .documento("78945612300")
                .dataNascimento(LocalDate.of(1999, 12, 1))
                .criaPessoa();

        pesssoaService.save(pessoa);

        Pessoa pessoaRetornada = pesssoaService.findById(1l);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pesssoaService.findById(1l);
        System.out.println(pessoaRetornadaCache);

    }
}
