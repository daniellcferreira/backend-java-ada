package Animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, String cor, double peso) {
        super(nome, cor, peso);

    }

    @Override
    public void soar() {
        System.err.println("Cachorro esta latindo...");
        ;
    }

}
