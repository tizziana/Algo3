package modelo.Cantador;

public class Canta implements Cantador {

    @Override
    public String cantarCancion(String pedido) {
        if (pedido == "Abel cantate algo") return "Si la vida..";
        if (pedido == "Gorrion canta") return "pio pio";
        return "no";
    }
}
