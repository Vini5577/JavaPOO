package oo.heranca.desafio;

public interface Luxo {
    
    void ligarAr();
    void desligarAr();
    
    default int velociadeDoAr() {
        return 1;
    }
}
