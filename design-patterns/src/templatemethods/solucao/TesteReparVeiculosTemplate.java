package templatemethods.solucao;

import templatemethods.VeiculoReparo;

public class TesteReparVeiculosTemplate {

    public static void main(String[] args) {
        VeiculoReparo veiculoLuxo = new VeiculoReparo();
        veiculoLuxo.setPorcentagemDano(50);

        ReparoVeiculoService rpl = new ReparVeiculoLuxoServiceTemplate(veiculoLuxo);
        rpl.reparaVeiculo();

        System.out.println("------------------------------");

        VeiculoReparo veiculoComum = new VeiculoReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparVeiculoComumServiceTemplate(veiculoComum);
        rpc.reparaVeiculo();
    }
}
