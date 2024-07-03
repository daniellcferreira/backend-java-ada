package adapter.solucao;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrenteAdapter jarAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarAdapter) {
        this.jarAdapter = jarAdapter;
    }

    public void sacar(BigDecimal valorPretendido) {
        jarAdapter.sacar(valorPretendido);
    }

    public void depositar(BigDecimal valor) {
        jarAdapter.depositar(valor);
    }
}
