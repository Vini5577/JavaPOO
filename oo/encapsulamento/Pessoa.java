package oo.encapsulamento;

public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String Sobrenome,int idade) {
        setNome(nome);
        setSobrenome(Sobrenome);
        setIdade(idade);
    }
    
    //Getter
    public int getIdade() {
        return idade;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ola eu sou o " + getNome() + " tenho " + getIdade() + " anos.";
    }


}
