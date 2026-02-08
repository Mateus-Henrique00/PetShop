package DesafioPetShop.Com.PetShop.Model;

import DesafioPetShop.StatusSaude;
import DesafioPetShop.TipoAnimal;

public class cao extends pet {
    public cao(String nome, int idade, Dono dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        super(nome, idade, dono, saude, tipoAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU... ");;
    }
}
