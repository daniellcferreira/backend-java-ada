package chainofresponsibility.solucao;

import java.math.BigDecimal;

import chainofresponsibility.Carro;

public class VendaCarroServiceChainOfResposibility {

    public BigDecimal calcularValorVenda(Carro carro) {
        DescontoCarro desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(new DescontoCarroMaiorCemMil(new SemDesconto(null))));

        return desconto.aplicarDesconto(carro);
    }
}
