package DesafioPetShop.Com.PetShop.Model;

import DesafioPetShop.StatusSaude;
import DesafioPetShop.TipoAnimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pet {
    private String nome;
    private int idade;
    private Dono dono;
    private StatusSaude saude;
    private TipoAnimal tipoAnimal;

    List<pet> clinica = new ArrayList<>();

    public pet(String nome, int idade, Dono dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.saude = saude;
        this.tipoAnimal = tipoAnimal;
    }

    public pet() {
    }

    public void emitirSom() {

    }
    public void listaDePet(){
        System.out.println(Arrays.asList(clinica));
    }

    public void adicionarPet(String nome, int idade, String dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        Dono us = new Dono(dono);
        us.setNome(dono);
        this.clinica.add(new pet(nome,idade, us , saude, tipoAnimal));

    }
    public void removerNome(String buscar){
        boolean remove = clinica.removeIf(pet -> pet.getNome().equalsIgnoreCase(buscar));

        if (remove){
            System.out.println("Pet removido com sucesso.");
        }else {
            System.out.println("Pet não encontrado.");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            return;
        }
        this.idade = idade;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public StatusSaude getSaude() {
        return saude;
    }

    public void setSaude(StatusSaude saude) {
        this.saude = saude;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public String toString() {
        return "pet{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dono='" + dono + '\'' +
                ", saude=" + saude +
                ", tipoAnimal=" + tipoAnimal +
                '}';
    }
}
