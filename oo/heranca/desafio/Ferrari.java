package oo.heranca.desafio;

public class Ferrari extends Carro{
    
    Ferrari() {
        this(315);
    }
    
    Ferrari(int velocidade_maxima) {
        super(velocidade_maxima);
        delta = 350;
    }
}
