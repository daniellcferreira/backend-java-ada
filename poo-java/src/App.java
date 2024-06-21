import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro = new Cachorro("rex", "preto", 5);

        Gato gato = new Gato("luds", "branco", 3);

        Passaro passaro = new Passaro("bird", "marron", 2);

        Petshop petshop = new Petshop();

        petshop.darBanho(passaro);
        System.out.println(passaro.getEstadoDeEspirito());

        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());

        petshop.tosar(cachorro);
        System.out.println(cachorro.getEstadoDeEspirito());


    }
}
