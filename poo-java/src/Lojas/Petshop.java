package Lojas;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }

}
