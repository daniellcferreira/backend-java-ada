package templatemethods.solucao;

import templatemethods.VeiculoReparo;

public class ReparVeiculoComumServiceTemplate extends ReparoVeiculoService {

    private VeiculoReparo veiculoReparo;

    public ReparVeiculoComumServiceTemplate(VeiculoReparo veiculoReparo) {
        this.veiculoReparo = veiculoReparo;
    }

    @Override
    protected boolean veiculoReparo() {
        return veiculoReparo.getPorcentagemDano() <= 70;
    }

}
