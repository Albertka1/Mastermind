import java.util.*;

public class ControladorPartida {
    private Partida partida;
    private int idToAssign = 0;
    
    public ControladorPartida() {
    }

    public void crearPartida(String tipusMode, String dificultat, List<Integer> solucio) {      
        ++idToAssign;      
        if (dificultat.equals("facil"))
            partida = new Partida<>(idToAssign,tipusMode,"facil", new CodiFacil(solucio));
        else
            partida = new Partida<>(idToAssign,tipusMode,"dificil", new CodiDificil(solucio));      
    }
    
    
    
    public Pair<Integer,Integer> introduirJugada(List<Integer> jugada){
        Codi j;
        if (partida.getDificultat().equals("facil")) j = new CodiFacil(jugada);
        else j = new CodiDificil(jugada);
        return partida.introduirJugada(j);
    }
    
    public List<Pair<List<Integer>,Pair<Integer,Integer>>> jugarPartidaCM(List<Integer> solucio){
        return partida.jugarPartidaCM(solucio);
    }
    
    public int getBolaAmbAjuda(){
       return partida.bolaAmbAjuda();
    }
    
    public int getPuntuacio(){
        partida.calculaPuntuacio();
        return partida.getPuntuacio();
    }
    
    public List<Integer> getSolucio(){
        return partida.getSolucio();
    }    
    
    public List<Pair<List<Integer>,Pair<Integer,Integer>>> getJugades(){
        return partida.getJugades();
    }
    
}
