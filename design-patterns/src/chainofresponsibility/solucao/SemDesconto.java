package chainofresponsibility.solucao;

import java.math.BigDecimal;

import chainofresponsibility.Carro;

public class SemDesconto extends DescontoCarro {

    public SemDesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicarDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }

}
