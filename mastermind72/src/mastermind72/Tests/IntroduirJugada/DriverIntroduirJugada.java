import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class DriverIntroduirJugada {
    
    public static void main(String[] args) {
        System.out.println("Driver cas d'us: Introduir Jugada");
        
        ControladorPartida cPartida = new ControladorPartida();
        
        String linea;
        String[] line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        try {
            //CB i facil
            System.out.println("Creem una partida en mode CodeBreaker i dificultat Facil");
            
            List<Integer> b = new ArrayList<> ();
            cPartida.crearPartida("CB", "facil", b);

            System.out.println("La solucio que s'ha generat es: "+cPartida.getSolucio());

            int fi = 0;

            while (fi != 4){
                // INTRODUEIX JUGADA
                System.out.println("Introdueix una jugada (4 numeros): ");
                linea = reader.readLine();
                line = linea.split(" ");

                List<Integer> in = new ArrayList<> ();
                in.add(Integer.parseInt(line[0]));
                in.add(Integer.parseInt(line[1]));
                in.add(Integer.parseInt(line[2]));
                in.add(Integer.parseInt(line[3]));

                Pair<Integer,Integer> res = cPartida.introduirJugada(in);
                fi = res.getRight();

                System.out.println("Jugada: "+in+" -> B:"+res.getLeft()+" N:"+res.getRight());
            }

            System.out.println("--Fi de la partida en mode CodeBreaker i dificultat Facil--");
            
            //CB i dificil
            System.out.println("Creem una partida en mode CodeBreaker i dificultat Dificil");
            
            List<Integer> b2 = new ArrayList<> ();
            cPartida.crearPartida("CB", "dificil", b2);

            System.out.println("La solucio que s'ha generat es: "+cPartida.getSolucio());

            fi = 0;

            while (fi != 6){
                // INTRODUEIX JUGADA
                System.out.println("Introdueix una jugada (6 numeros): ");
                linea = reader.readLine();
                line = linea.split(" ");

                List<Integer> in = new ArrayList<> ();
                in.add(Integer.parseInt(line[0]));
                in.add(Integer.parseInt(line[1]));
                in.add(Integer.parseInt(line[2]));
                in.add(Integer.parseInt(line[3]));
                in.add(Integer.parseInt(line[4]));
                in.add(Integer.parseInt(line[5]));

                Pair<Integer,Integer> res = cPartida.introduirJugada(in);
                fi = res.getRight();

                System.out.println("Jugada: "+in+" -> B:"+res.getLeft()+" N:"+res.getRight());
            }

            System.out.println("--Fi de la partida en mode CodeBreaker i dificultat Dificil--");
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        

    }
    
}
