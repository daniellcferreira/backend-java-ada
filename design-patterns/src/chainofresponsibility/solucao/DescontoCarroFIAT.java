package chainofresponsibility.solucao;

import java.math.BigDecimal;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;

public class DescontoCarroFIAT extends DescontoCarro {

    public DescontoCarroFIAT(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicarDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if (Marca.FIAT.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }
        return proximoDesconto.aplicarDesconto(carro);
    }

}
