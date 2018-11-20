package mastermind72.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ismael.haddad.ez-zarraty
 */


public class Driver_ControladorPartida {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Creem una partida amb mode = CB i dificultat = facil");
        ControladorPartida c = new ControladorPartida();
        c.crearPartida(1, "CB", "facil", null);
        Pair<String,Integer> resultat = c.jugarPartidaActual("facil",reader);
        resultat.printValues();

        System.out.println("Creem una partida amb mode = CB i dificultat = dificil");
        ControladorPartida c2 = new ControladorPartida();
        c2.crearPartida(2, "CB", "dificil", null);
        Pair<String,Integer> resultat2 = c2.jugarPartidaActual("dificil",reader);
        resultat2.printValues();

        List<Integer> sol4 = new ArrayList<>();
        sol4.add(1);
        sol4.add(2);
        sol4.add(3);
        sol4.add(4);
        System.out.println("Creem una partida amb mode = CM i dificultat = facil");
        ControladorPartida c3 = new ControladorPartida();
        c3.crearPartida(3, "CB", "facil",new CodiFacil(sol4));
        Pair<String,Integer> resultat3 = c3.jugarPartidaActual("facil",reader);
        resultat3.printValues();

        List<Integer> sol6 = new ArrayList<>();
        sol6.add(1);
        sol6.add(2);
        sol6.add(3);
        sol6.add(4);
        sol6.add(5);
        sol6.add(6);
        System.out.println("Creem una partida amb mode = CB i dificultat = dificil");
        ControladorPartida c4 = new ControladorPartida();
        c4.crearPartida(4, "CB", "dificil", new CodiDificil(sol6));
        Pair<String,Integer> resultat4 = c4.jugarPartidaActual("dificil",reader);
        resultat4.printValues();

        reader.close();
    }
    
}
