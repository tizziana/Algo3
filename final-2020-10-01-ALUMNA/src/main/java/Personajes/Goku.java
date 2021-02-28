package Personajes;

import Estados.*;

public class Goku extends Personaje {
    private Estado estadoKaiohKen;

    public Goku() {
        this.vida = 5000;
        estadoKaiohKen = new SinKaiohKen();
    }

    public void aplicarKaiohKen(Estado estado) {
        estadoKaiohKen = estado;
    }

    public void atacarConKameHameHA(Vegeta vegeta) {
        if (comprobarPersonajesMuertos(vegeta, this)) return;
        estadoKaiohKen.atacar(vegeta, this);
    }

    public void turnoTrajeTerminado() {
        estadoKaiohKen = new SinKaiohKen();
    }

    public void aumentaVidaPorAtaqueX4(double aumentoDeVida) {
        this.vida += 300;
    }
}
