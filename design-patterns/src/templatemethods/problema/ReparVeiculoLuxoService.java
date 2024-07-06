package templatemethods.problema;

import templatemethods.VeiculoReparo;

public class ReparVeiculoLuxoService {

    private VeiculoReparo veiculoReparo;

    public ReparVeiculoLuxoService(VeiculoReparo veiculoReparo) {
        this.veiculoReparo = veiculoReparo;
    }

    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();
        if (veiculoReparo()) {
            repararVeiculo();
            notificarReparoSeguradora();
        } else {
            notificarPerdaTotalSeguradora();
        }
    }

    private boolean veiculoReparo() {
        return veiculoReparo.getPorcentagemDano() <= 50;
    }

    private void notificarPerdaTotalSeguradora() {
        System.out.println("Notificando perda total para seguradora...");
    }

    private void notificarReparoSeguradora() {
        System.out.println("Notificando reparo para seguradora...");
    }

    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    private void analisarDanos() {
        System.out.println("Analisando danos...");
    }

    private void entradaOficina() {
        System.out.println("Veiculo entrando na Oficina...");
    }
}
