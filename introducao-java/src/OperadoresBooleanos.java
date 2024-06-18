public class OperadoresBooleanos {

    public static void main(String[] args) {

        // exemplo 1
        boolean resultado = false;
        System.out.println(resultado);

        // exemplo 2
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // exemplo 3
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}
