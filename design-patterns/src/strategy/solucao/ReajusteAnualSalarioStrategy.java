package strategy.solucao;

import strategy.Funcionario;

public class ReajusteAnualSalarioStrategy {

    public void calcularReajusteAnual(Funcionario funcionario, CalculadoraReajusteAnualSalario calculadora) {
        calculadora.calcularReajusteAnual(funcionario);
    }
}
