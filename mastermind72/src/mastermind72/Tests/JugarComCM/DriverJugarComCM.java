import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class DriverJugarComCM {
    
    public static void main(String[] args) {
        System.out.println("Driver cas d'us: Jugar com a CodeMaker");
        
        ControladorPartida cPartida = new ControladorPartida();
        
        String linea;
        String[] line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        try {
            //CM i facil
            System.out.println("Creem una partida en mode CodeMaker i dificultat Facil");
            
            System.out.println("Introdueix una solucio");
            linea = reader.readLine();
            line = linea.split(" ");
            List<Integer> sol = new ArrayList<> ();
            sol.add(Integer.parseInt(line[0]));
            sol.add(Integer.parseInt(line[1]));
            sol.add(Integer.parseInt(line[2]));
            sol.add(Integer.parseInt(line[3]));
            
            cPartida.crearPartida("CM", "facil", sol);
            
            List<Pair<List<Integer>,Pair<Integer,Integer>>> jugades = cPartida.jugarPartidaCM();
            
            for (Pair<List<Integer>,Pair<Integer,Integer>> j : jugades){
                System.out.println("Jugada: "+j.getLeft()+" -> B:"+j.getRight().getLeft()+" N:"+j.getRight().getRight());
            }

            System.out.println("--Fi de la partida en mode CodeMaker i dificultat Facil--");

        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        

    }
    
}
