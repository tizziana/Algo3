package Personajes;

public class Vegeta extends Personaje {
    public Vegeta(){
        this.vida = 6000;
    }

    public void atacarConGalickHo(Goku goku){
        if (comprobarPersonajesMuertos(goku, this)) return;
        goku.esAtacado(100 + this.vida * 0.1);
    }
}
