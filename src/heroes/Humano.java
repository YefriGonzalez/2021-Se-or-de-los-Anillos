package src.heroes;

import src.main.Dado;

public class Humano extends Heroe {

    public Humano(String nombre) {
        super(180, nombre,Dado.dadoParaCreacionPersonaje(50, 70));
    }
    
    
}
