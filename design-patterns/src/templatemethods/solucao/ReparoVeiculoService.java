package templatemethods.solucao;

public abstract class ReparoVeiculoService {

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

    protected abstract boolean veiculoReparo();

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
