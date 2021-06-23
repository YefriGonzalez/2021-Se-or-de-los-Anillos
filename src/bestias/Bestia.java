package src.bestias;
import src.ente.Ente;
import src.main.Dado;

public class Bestia extends Ente {
    
    private static int ataqueMaximo=90;
    private static int bestiasCreadas=0;

    public Bestia(int vida, String nombre, int resistenciaArmadura ) {
        super(vida, nombre, resistenciaArmadura,ataqueMaximo);
        bestiasCreadas++;
    }

    public static int getBestiasCreadas(){
        return bestiasCreadas;
    }

    @Override
    public int getAtaque(){
        return Dado.tirarDado(0,ataqueMaximo,1);
    }
    
}
