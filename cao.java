package DesafioPetShop;

public class cao extends pet {
    public cao(String nome, int idade, String dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        super(nome, idade, dono, saude, tipoAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU... ");;
    }
}
