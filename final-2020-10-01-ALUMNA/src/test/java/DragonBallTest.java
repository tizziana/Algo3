import Estados.KaiohKen;
import Personajes.Goku;
import Personajes.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragonBallTest {

    @Test
    public void GokuInicializaConVida5000test01() {
        Goku goku = new Goku();

        assertEquals(5000, goku.getVida());
    }

    @Test
    public void VegetaInicializaConVida6000test02() {
        Vegeta vegeta = new Vegeta();

        assertEquals(6000, vegeta.getVida());
    }


    @Test
    public void GokuAtacaAVegetaYLoDejaCon5950VidaTest03() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacarConBolaDeEnergia(vegeta);

        assertEquals(5950, vegeta.getVida());
    }

    @Test
    public void GokuAtacaAVegetaYLoDejaCon5900VidaTest04() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacarConKameHameHA(vegeta);

        assertEquals(5900, vegeta.getVida());
    }

    @Test
    public void GokuAtacaAVegetaConKaiohKenTest05() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        KaiohKen kaiohKen = new KaiohKen();

        goku.aplicarKaiohKen(kaiohKen);
        goku.atacarConKameHameHA(vegeta);

        assertEquals(3600, vegeta.getVida());
    }

    @Test
    public void GokuAtacaAVegetaConKaiohKenConBolaDeEnergiaTest06() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacarConBolaDeEnergia(vegeta);

        assertEquals(5950, vegeta.getVida());
    }

    @Test
    public void VegetaAtacaAGokuConBolaDeEnergiaTest07() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        vegeta.atacarConBolaDeEnergia(goku);

        assertEquals(4950, goku.getVida());
    }

    @Test
    public void VegetaAtacaAGokuConGalickHoTet08() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        vegeta.atacarConGalickHo(goku);

        assertEquals(4300, goku.getVida());
    }
    //no llegue con mas pruebas, espero que sean suficientes :)

}
