package strategy.problema;

import java.math.BigDecimal;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

public class TesteAjusteSalario {

    public static void main(String[] args) {

        ReajusteAnualSalario reajusteAnulSalario = new ReajusteAnualSalario();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Pedro");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Maria");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));

        reajusteAnulSalario.calcularReajusteAnual(funcionarioEstagio);
        reajusteAnulSalario.calcularReajusteAnual(funcionarioCLT);
        reajusteAnulSalario.calcularReajusteAnual(funcionarioPJ);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}
