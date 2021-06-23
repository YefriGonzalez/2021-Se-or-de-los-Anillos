package src.heroes;
import src.main.*;

public class Hobbit extends Heroe {

    public Hobbit(String nombre) {
        super(200, nombre, Dado.dadoParaCreacionPersonaje(50,70));
    }
    
}
