package Animais;

public class Gato extends Animal {

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.err.println("Gato esta miando...");
    }

}
