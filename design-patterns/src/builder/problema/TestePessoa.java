package builder.problema;

import java.time.LocalDate;

import builder.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Daniel", "Ferreira", "123456789", "exemplo@teste.com", "dan",
                LocalDate.of(1990, 1, 1));

        System.out.println(pessoa);
    }

}
