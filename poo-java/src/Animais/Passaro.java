package Animais;

public class Passaro extends Animal {

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);

    }

    @Override
    public void soar() {
        System.err.println("Passaro está cantando...");
    }

}
