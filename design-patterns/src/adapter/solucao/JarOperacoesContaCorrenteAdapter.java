package adapter.solucao;

import java.math.BigDecimal;

import adapter.problema.JarOperacoesContaCorrente;

public class JarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    public void sacar(BigDecimal valorPretendido) {
        if (jarConta.validarSaldo(valorPretendido)) {
            jarConta.sacar(valorPretendido);
        } else {
            throw new IllegalArgumentException("valor para saque não permitido");
        }
    }

    public void depositar(BigDecimal valor) {
        jarConta.depositar(valor);
    }
}
