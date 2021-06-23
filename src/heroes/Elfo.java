package src.heroes;
import src.main.*;
import src.ente.*;

public class Elfo extends Heroe {

    public Elfo(String nombre) {
        super(250, nombre, Dado.dadoParaCreacionPersonaje(50,70));
    }
    
    @Override
    public int modificacionAtaque(Ente defensor){
        if (defensor instanceof Elfo){
            System.out.println(" "+ this.getNombre() + " furia de un ELFO------ ");
            return this.getAtaque() + 10;

        }
        
        return this.getAtaque();
    }

}
