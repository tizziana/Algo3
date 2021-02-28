package Personajes;

public abstract class Personaje {
    protected double vida;

    public double getVida() {
        return this.vida;
    }

    public void esAtacado(double vidaARestar){
          this.vida -= vidaARestar;
    }

    public void atacarConBolaDeEnergia(Personaje personaje) {
        if (comprobarPersonajesMuertos(personaje, this)) return;
        personaje.esAtacado(50);
    }

    protected boolean estaMuerto(){return (vida<0);}

    public boolean comprobarPersonajesMuertos(Personaje personaje1, Personaje personaje2){
        return (personaje1.estaMuerto() || personaje2.estaMuerto());
    }
}
