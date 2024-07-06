package templatemethods.problema;

import templatemethods.VeiculoReparo;

public class TesteReparVeiculos {

    public static void main(String[] args) {
        VeiculoReparo veiculoLuxo = new VeiculoReparo();
        veiculoLuxo.setPorcentagemDano(50);

        ReparVeiculoLuxoService rpl = new ReparVeiculoLuxoService(veiculoLuxo);
        rpl.reparaVeiculo();

        System.out.println("------------------------------");

        VeiculoReparo veiculoComum = new VeiculoReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparVeiculoComumService rpc = new ReparVeiculoComumService(veiculoComum);
        rpc.reparaVeiculo();
    }
}
