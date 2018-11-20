/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author albert
 */
public class Driver_CridesControladorPresent {
    private static void espera(){
        try{
            Thread.sleep(4000);
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    } 
    
    public static void main(String args[]){
        System.out.println("Driver Presentació");
        ControladorPresentacio cPresentacio = new ControladorPresentacio();
        
        System.out.println("Probant crides a mètodes des del controlador de Presentació:");
        System.out.println("--------------------");
        
        System.out.println("\nProbant crida a crear nova partida");
        List<Integer> buida = new ArrayList<>();
        cPresentacio.cridaControladorPartida_CrearPartida("facil", "CB", buida);
        System.out.println("Creació de partida correcta");
        
        System.out.println("\nProbant crida a introduir jugada");
            System.out.println("\tIntroduint jugada [2,4,6,8]");
        List<Integer> in = new ArrayList<>();in.add(2);in.add(4);in.add(6);in.add(8);
        Pair<Integer,Integer> res = cPresentacio.cridaControladorPartida_IntroduirJugada(in);
        System.out.println("Introducció de jugada correcta" + res);
        
        System.out.println("\nProbant crida a demanar ajuda bola");
        int bola = cPresentacio.cridaControladorPartida_getBolaAmbAjuda();
        System.out.println("Ajuda retornada: codi de la bola amb ajuda (" + bola + ")");
        
        System.out.println("\nProbant crida a get jugades");
        List<Pair<List<Integer>,Pair<Integer,Integer>>> l = cPresentacio.cridaControladorPartida_getJugades();
        System.out.println("Jugades retornades: " + l);
        
        System.out.println("\nProbant crida a get solucio");
        List<Integer> solucio = cPresentacio.cridaControladorPartida_getSolucio();
        System.out.println("Solucio retornada: " + solucio);
        
        System.out.println("\nProbant crida a introduir record amb nom 'Joan' i dificultat dificil");
        cPresentacio.cridaControladorDomini_IntroduirRecord("Joan", "dificil");
        System.out.println("Record correctament introduit");
        
        System.out.println("\nProbant crida a get rankings amb dificultat dificil");
        List<Pair<String,Integer>> ranks = cPresentacio.cridaControladorRanking_GetRankings("dificil");
        System.out.println("Rankings retornats correctament: " + ranks);
        
        System.out.println("\nProbant crida a get llista partides guardades");
        List<Pair<String,String>> parts = cPresentacio.cridaControladorPartida_consultarllistaPartidesGuardades();
        System.out.println("Partides retornades correctament: " + parts);
        
        System.out.println("\nProbant crida a jugar partida CM");
            System.out.println("\tIntroduint jugada [1,3,5,7]");
        List<Integer> ins = new ArrayList<>();ins.add(1);ins.add(3);ins.add(5);ins.add(7);
        cPresentacio.cridaControladorPartida_CrearPartida("facil", "CM", ins);
        List<Pair<List<Integer>,Pair<Integer,Integer>>> jug = cPresentacio.cridaControladorPartida_JugarPartidaCM();
        System.out.println("Partida correctament jugada" + jug);
        
        System.out.println("\nProbant crida a guardar dades");
        cPresentacio.cridaControladorDomini_guardarDades();
        System.out.println("Partida correctament desada");
        
        System.out.println("\nProbant crida a carregar partida");
        String nom = parts.get(0).getLeft();
        cPresentacio.cridaControladorPartida_CarregarPartida(nom);
        System.out.println("Partida correctament carregada");

        System.out.println("--------------------"); 
        System.out.println("Mètodes correctament cridats sense cap error.");      
    }
}
