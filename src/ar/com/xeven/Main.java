package ar.com.xeven;

import java.util.ArrayList;

/*
En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones,
una torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente,
1 peón. Realiza un programa que genere al azar las capturas que ha hecho
un jugador durante una partida. El número de capturas será un valor aleatorio
entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de
capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles,
2 caballos y 8 peones. Al final debe aparecer la puntuación total.
Ejemplo:
Fichas capturadas por el jugador:
Alfil (3 peones)
Caballo (2 peones)
Peón (1 peones)
Torre (5 peones)
Peón (1 peones)
Puntos totales: 12 peones.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Ajedrez> piezas = new ArrayList<Ajedrez>();

        piezas.add(new Ajedrez("Dama",9,1));
        piezas.add(new Ajedrez("Torre",5,2));
        piezas.add(new Ajedrez("Alfil",3,2));
        piezas.add(new Ajedrez("Caballo",2,2));
        piezas.add(new Ajedrez("Peon",1,8));

        System.out.println("Ficjas capturadas por el jugador: ");

        int capturasTotales = (int)(Math.random()*15);
        int contadorCapturas = 0;
        int peonesTotales = 0;

        do {
            //genera una captura aleatoria
            Ajedrez piezaAux = piezas.get((int) (Math.random()*piezas.size()));
            if (piezaAux.esCapturable()){
                piezaAux.captura();
                System.out.println(piezaAux);
                contadorCapturas++;
                peonesTotales += piezaAux.getValorPieza();
            }
        } while (contadorCapturas<capturasTotales);
        System.out.println("Puntos totales: "+peonesTotales);
    }
}
