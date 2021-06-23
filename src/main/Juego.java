package src.main;
import src.bestias.*;
import src.heroes.*;

public class Juego {
    
    private Bestia[] bestias;
    private Heroe[] heroes;

    public Juego(){
        bestias=new Bestia[5];
        heroes=new Heroe[5];
    }

    public void CreacionBestias(){
        int aleatorio;
        for(int i=0;i<bestias.length;i++){
            aleatorio=Dado.dadoParaCreacionPersonaje(0,10);
            if(aleatorio>=0 && aleatorio<5){
                bestias[i]= new Orco("ORCO: Sagdat");
            } else {
                bestias[i]= new Trasgo("TRASGO: Shrek");
            }
        }
    }

    public void creacionHeroes(){
        int aleatorio;
        for(int i=0;i<heroes.length;i++){
            aleatorio=Dado.dadoParaCreacionPersonaje(0,15);
            if(aleatorio>=0 && aleatorio<5){
                heroes[i]= new Elfo("ELFO: Finrod");
            } else if(aleatorio>=5 && aleatorio<10){
                heroes[i]=new Hobbit("HOBBIT: Frodo");
            } else {  
                heroes[i]=new Humano("HUMANO: Aragorn");
            } 
        }
    }
    
}
