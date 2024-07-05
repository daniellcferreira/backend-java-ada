package chainofresponsibility.solucao;

import java.math.BigDecimal;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;

public class DescontoCarroFORD extends DescontoCarro {

    public DescontoCarroFORD(DescontoCarroMaiorCemMil descontoCarroMaiorCemMil) {
        super(descontoCarroMaiorCemMil);
    }

    @Override
    public BigDecimal aplicarDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if (Marca.FORD.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(2000));
        }
        return proximoDesconto.aplicarDesconto(carro);
    }

}
