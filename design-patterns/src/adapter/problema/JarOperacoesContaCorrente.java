package adapter.problema;

import java.math.BigDecimal;

public class JarOperacoesContaCorrente {

    public boolean validarSaldo(BigDecimal valorPretendidoSaque) {
        System.out.println("validando saldo...");
        return true;
    }

    public void sacar(BigDecimal valorPretendido) {
        System.out.println("sacando...");
    }

    public void depositar(BigDecimal valor) {
        System.out.println("depositando...");
    }
}
