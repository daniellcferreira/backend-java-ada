package ada.implementation;

public class SupermarketArray implements Supermarket {

    private final String[] itens;

    private int lastIndex;

    public SupermarketArray(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(String item) {
        if (lastIndex == itens.length - 1) {
            System.err.println("Lista de Supermercado cheia!");
        } else {
            lastIndex++;
            itens[lastIndex] = item;
        }

    }

    @Override
    public void print() {
        System.out.println("###############################");
        if (lastIndex < 0) {
            System.out.println("Lista de Supermercado vazia");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("###############################");

    }

    @Override
    public void delete(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.out.println("Indice invalido: " + index);
        }
    }

    private void shift(final int index) {
        for (int i = index; i < lastIndex; i++) {
            itens[i] = itens[i + 1];
        }
    }

}
