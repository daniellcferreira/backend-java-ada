package adapter.problema;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrente {

    private JarOperacoesContaCorrente jocc;

    public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }

    public boolean validarSaldo(BigDecimal valorPretendidoSaque) {
        return jocc.validarSaldo(valorPretendidoSaque);
    }

    public void sacar(BigDecimal valorPretendido) {
        jocc.sacar(valorPretendido);
    }

    public void depositar(BigDecimal valor) {
        jocc.depositar(valor);
    }
}
