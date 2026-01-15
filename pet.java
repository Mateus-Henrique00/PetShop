package DesafioPetShop;

public class pet {
     private String nome;
     private int idade;
     private String dono;
     private StatusSaude saude;
     private TipoAnimal tipoAnimal;


    public pet(String nome, int idade, String dono, StatusSaude saude, TipoAnimal tipoAnimal) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.saude = saude;
        this.tipoAnimal = tipoAnimal;
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
        if (idade < 0){
            return;
        }
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
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
