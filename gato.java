package DesafioPetShop;

public class gato extends pet{


    public gato(String nome, int idade, String dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        super(nome, idade, dono, saude, tipoAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau...");;
    }
}
