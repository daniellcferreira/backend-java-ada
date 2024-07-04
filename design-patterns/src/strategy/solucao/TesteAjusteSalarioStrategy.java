package strategy.solucao;

import java.math.BigDecimal;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

public class TesteAjusteSalarioStrategy {

    public static void main(String[] args) {

        ReajusteAnualSalarioStrategy reajusteAnualSalario = new ReajusteAnualSalarioStrategy();

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

        reajusteAnualSalario.calcularReajusteAnual(funcionarioEstagio, new CalculadoraReajusteAnualESTAGIO());
        reajusteAnualSalario.calcularReajusteAnual(funcionarioCLT, new CalculadoraReajusteAnualCLT());
        reajusteAnualSalario.calcularReajusteAnual(funcionarioPJ, new CalculadoraReajusteAnualPJ());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioPJ);
    }

}
