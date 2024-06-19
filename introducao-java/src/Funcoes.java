public class Funcoes {

    public static void main(String[] args) {
        String nome = "Let's code";
        saudacao(nome);

        int resultado = soma(2, 3);

    }

    // exemplo1
    public static void saudacao(String nome) {
        System.out.println("Hello, " + nome);
    }

    // exemplo2
    public static int soma(int a, int b) {
        return a + b;
    }
}
