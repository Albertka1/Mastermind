package mastermind72.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ismael.haddad.ez-zarraty
 */
public class Driver_Jugada {
    
    public static void main(String[] args) {
        List<Integer> sol4 = new ArrayList<>();
        sol4.add(1);
        sol4.add(2);
        sol4.add(3);
        sol4.add(4);

        List<Integer> in4correcte = new ArrayList<>();
        in4correcte.add(1);
        in4correcte.add(2);
        in4correcte.add(3);
        in4correcte.add(4);

        List<Integer> in4erroni = new ArrayList<>();
        in4erroni.add(2);
        in4erroni.add(2);
        in4erroni.add(1);
        in4erroni.add(4);

        System.out.println("Prova amb solucio " + sol4);
        System.out.println("Creem una jugada facil amb combinacio " + in4erroni);
        Jugada<CodiFacil> jferroni = new Jugada<>(new CodiFacil(in4erroni));

        System.out.println("Processem la jugada.");
        jferroni.executarJugada(new CodiFacil(sol4));
        System.out.println("getBN() =>");
        jferroni.getBN().printValues();

        System.out.println("Creem una jugada facil amb combinacio " + in4correcte);
        Jugada<CodiFacil> jfcorrecte = new Jugada<>(new CodiFacil(in4correcte));

        System.out.println("Processem la jugada.");
        jferroni.executarJugada(new CodiFacil(sol4));
        System.out.println("getBN() =>");
        jferroni.getBN().printValues();



        List<Integer> sol6 = new ArrayList<>();
        sol6.add(1);
        sol6.add(2);
        sol6.add(3);
        sol6.add(4);
        sol6.add(5);
        sol6.add(6);

        List<Integer> in6correcte = new ArrayList<>();
        in6correcte.add(1);
        in6correcte.add(2);
        in6correcte.add(3);
        in6correcte.add(4);
        in6correcte.add(5);
        in6correcte.add(6);

        List<Integer> in6erroni = new ArrayList<>();
        in6erroni.add(2);
        in6erroni.add(2);
        in6erroni.add(1);
        in6erroni.add(4);
        in6erroni.add(1);
        in6erroni.add(4);

        System.out.println("Prova amb solucio " + sol6);
        System.out.println("Creem una jugada dificil amb combinacio " + in6erroni);
        Jugada<CodiDificil> jderroni = new Jugada<>(new CodiDificil(in6erroni));

        System.out.println("Processem la jugada.");
        jderroni.executarJugada(new CodiDificil(sol6));
        System.out.println("getBN() =>");
        jderroni.getBN().printValues();

        System.out.println("Creem una jugada dificil amb combinacio " + in6erroni);
        Jugada<CodiDificil> jdcorrecte = new Jugada<>(new CodiDificil(in6erroni));

        System.out.println("Processem la jugada.");
        jderroni.executarJugada(new CodiDificil(sol6));
        System.out.println("getBN() =>");
        jderroni.getBN().printValues();
    }
    
}
