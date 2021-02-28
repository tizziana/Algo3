package modelo.Corredor;

import modelo.SerVivo.*;

public class Corre {
        public int corre(String superficie, AbelPintos abelPintos) {
                if (superficie == "PISTA_ATLETISMO") return 15;
                else if (superficie == "BARRO") return 2;
                return -1;
                };

        public int corre(String superficie, Avestruz avestruz) {
                if (superficie == "PISTA_ATLETISMO" || superficie ==  "BARRO") return 70;
                else if (superficie == "HIELO") return 0;
                return -1;
        }

        public int corre(String superficie, Pinguino pinguino) {
                if (superficie == "HIELO") return 5;
                return -1;
        }
}

