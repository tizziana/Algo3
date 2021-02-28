package Estados;

import Personajes.Goku;
import Personajes.Personaje;
import Personajes.Vegeta;

public abstract class Estado {
    protected double intensidad;

    public abstract void atacar(Vegeta vegeta, Goku goku);
}
