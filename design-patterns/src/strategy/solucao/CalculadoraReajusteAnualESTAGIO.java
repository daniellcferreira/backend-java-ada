package strategy.solucao;

import java.math.BigDecimal;

import strategy.Funcionario;

public class CalculadoraReajusteAnualESTAGIO implements CalculadoraReajusteAnualSalario {

    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
    }

}
