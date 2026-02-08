package DesafioPetShop.Com.PetShop.View;

import DesafioPetShop.Com.PetShop.Model.Dono;
import DesafioPetShop.StatusSaude;
import DesafioPetShop.TipoAnimal;
import DesafioPetShop.Com.PetShop.Model.pet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        pet p = new pet();
        System.out.println("1° Cadastrar Pet (Cão ou Gato).\n" +
                "2° Listar todos os Pets (mostrando nome e status).\n" +
                "3° Remover Pet (por nome).\n" +
                "4° Sair.");

        int op = sc.nextInt();
        sc.nextLine();

        while (op != 4) {

            switch (op) {
                case 1:
                    System.out.printf("Digite nome do pet: ");
                    String nome = sc.nextLine();

                    System.out.printf("Digite a idade; ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o nome do Dono: ");
                    String dono = sc.nextLine();

                    System.out.print("Digite o Tipo do animal: ");
                    String tipo = sc.nextLine().toUpperCase();

                    TipoAnimal tipoAnimal = TipoAnimal.valueOf(tipo);

                    System.out.print("Digite o estado de saude: ");
                    String status = sc.nextLine().toUpperCase();

                    StatusSaude saude = StatusSaude.valueOf(status);

                    p.adicionarPet(nome,idade, dono,saude,tipoAnimal);

                    System.out.println("Pet cadastrado com sucesso.");


                    break;

                case 2:
                    p.listaDePet();

                    break;


                case 3:

                    System.out.printf("Digite o nome que deseja remover:");
                    String nomeProcurado = sc.nextLine();
                    p.removerNome(nomeProcurado);
                    break;


            }
            System.out.println("1° Cadastrar Pet (Cão ou Gato).\n" +
                    "2° Listar todos os Pets (mostrando nome e status).\n" +
                    "3° Remover Pet (por nome).\n" +
                    "4° Sair.");

            op = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Saindo...");
    }
}
