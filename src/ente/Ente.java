package src.ente;

public class Ente {
    
    private int vida;
    private String nombre;
    private int resistenciaArmadura;
    private int limiteSuperiorAtaque;
    private int cantidadDados;
    private int ataque;
    private String[] figuraBestia;
    private String[] figuraMuerto;
    private String[] figuraHeroe;

    public Ente(int vida, String nombre, int resistenciaArmadura,int ataqueMaximo) {
        this.vida = vida;
        this.nombre = nombre;
        this.resistenciaArmadura = resistenciaArmadura;
        this.limiteSuperiorAtaque=ataqueMaximo;
       
    }

    

    public int getVida() {
        return vida;
    }


    public String getNombre() {
        return nombre;
    }

    public int getResistenciaArmadura() {
        return resistenciaArmadura;
    }

    public int getLimiteSuperiorAtaque() {
        return limiteSuperiorAtaque;
    }    

    public int getAtaque(){
        return ataque;
    }

    public int modificacionAtaque(Ente ente){
        return ente.ataque;
    }
    
}
