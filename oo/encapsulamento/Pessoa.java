package oo.encapsulamento;

public class Pessoa {
    

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    //Getter
    public int getIdade() {
        return idade;
    }

    //Setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
        this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ola eu sou o " + getNome() + " tenho " + getIdade() + " anos.";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
