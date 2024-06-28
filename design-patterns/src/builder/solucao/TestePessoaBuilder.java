package builder.solucao;

import java.time.LocalDate;

import builder.Pessoa;

public class TestePessoaBuilder {

    public static void main(String[] args) {

        Pessoa pessoa = new PessoaBuilder()
                .nome("Daniel")
                .sobreNome("Ferreira")
                .documento("12345678900")
                .email("exemplo@teste.com")
                .apelido("dan")
                .dataNascimento(LocalDate.of(1990, 1, 1))
                .criaPessoa();

        System.out.println(pessoa);
    }

}
