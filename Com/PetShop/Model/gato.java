package DesafioPetShop.Com.PetShop.Model;

import DesafioPetShop.StatusSaude;
import DesafioPetShop.TipoAnimal;

public class gato extends pet {


    public gato(String nome, int idade, Dono dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        super(nome, idade, dono, saude, tipoAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau...");;
    }
}
