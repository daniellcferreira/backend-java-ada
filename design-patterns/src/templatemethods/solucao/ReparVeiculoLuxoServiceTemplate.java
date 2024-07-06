package templatemethods.solucao;

import templatemethods.VeiculoReparo;

public class ReparVeiculoLuxoServiceTemplate extends ReparoVeiculoService {

    private VeiculoReparo veiculoReparo;

    public ReparVeiculoLuxoServiceTemplate(VeiculoReparo veiculoReparo) {
        this.veiculoReparo = veiculoReparo;
    }

    @Override
    protected boolean veiculoReparo() {
        return veiculoReparo.getPorcentagemDano() <= 50;
    }

}
