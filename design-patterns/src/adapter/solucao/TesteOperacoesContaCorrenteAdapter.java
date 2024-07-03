package adapter.solucao;

import java.math.BigDecimal;

import adapter.problema.JarOperacoesContaCorrente;

public class TesteOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();

        JarOperacoesContaCorrenteAdapter jarAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);

        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarAdapter);

        BigDecimal valorPretendidoSaque = new BigDecimal(1000);

        client.sacar(valorPretendidoSaque);

        client.depositar(new BigDecimal(500));

    }
}
