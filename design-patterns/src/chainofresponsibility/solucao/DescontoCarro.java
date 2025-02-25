package chainofresponsibility.solucao;

import java.math.BigDecimal;

import chainofresponsibility.Carro;

public abstract class DescontoCarro {

    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicarDesconto(Carro carro);
}
