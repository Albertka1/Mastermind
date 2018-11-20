import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DriverJugada {

    public static void main(String[] args) {
        System.out.println("Driver Jugada");
        
        String linea;
        String[] line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Escull una difiucltat (facil o dificil): ");
        
        try {
            String dificultat = reader.readLine();

            if (dificultat.equals("facil")){
                // INTRODUEIX SOLUCIO
                System.out.println("Introdueix una solucio (4 numeros): ");
                linea = reader.readLine();
                line = linea.split(" ");
                
                List<Integer> sol = new ArrayList<> ();
                sol.add(Integer.parseInt(line[0]));
                sol.add(Integer.parseInt(line[1]));
                sol.add(Integer.parseInt(line[2]));
                sol.add(Integer.parseInt(line[3]));
                System.out.println("Solucio: "+sol);
                
                CodiFacil solucio = new CodiFacil(sol);
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

                    CodiFacil intro = new CodiFacil(in);

                    Jugada<CodiFacil> jugadaFacil = new Jugada<>(intro);
                    
                    Pair<Integer,Integer> res = jugadaFacil.executarJugada(solucio);
                    fi = res.getRight();
                    
                    System.out.println("Jugada: "+in+" -> B:"+res.getLeft()+" N:"+res.getRight());
                }
                
            }

            if (dificultat.equals("dificil")){
                // INTRODUEIX SOLUCIO
                System.out.println("Introdueix una solucio (6 numeros): ");
                linea = reader.readLine();
                line = linea.split(" ");
                
                List<Integer> sol = new ArrayList<> ();
                sol.add(Integer.parseInt(line[0]));
                sol.add(Integer.parseInt(line[1]));
                sol.add(Integer.parseInt(line[2]));
                sol.add(Integer.parseInt(line[3]));
                sol.add(Integer.parseInt(line[4]));
                sol.add(Integer.parseInt(line[5]));
                System.out.println("Solucio: "+sol);
                
                CodiDificil solucio = new CodiDificil(sol);
                int fi = 0;
                
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

                    CodiDificil intro = new CodiDificil(in);

                    Jugada<CodiDificil> jugadaFacil = new Jugada<>(intro);
                    
                    Pair<Integer,Integer> res = jugadaFacil.executarJugada(solucio);
                    fi = res.getRight();
                    
                    System.out.println("Jugada: "+in+" -> B:"+res.getLeft()+" N:"+res.getRight());
                }
                
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
