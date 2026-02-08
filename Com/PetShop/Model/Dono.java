package DesafioPetShop.Com.PetShop.Model;

public class Dono {
    private String nome;

    public Dono(String nome) {
        this.nome = nome;
    }

    public Dono() {
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome;
    }
}
