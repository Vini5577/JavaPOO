package oo.heranca.desafio;

public class Carro {
    
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidade_maxima) {
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    void acelerar() {
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é  " + velocidadeAtual + "Km/h."; 
    }
}
