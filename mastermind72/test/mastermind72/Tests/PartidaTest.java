/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author albert.carreira
 */
public class PartidaTest {
    
    public static void main(String[] args) throws Exception {                    
       JUnitCore.main(
         "PartidaTest.jar");            
    }
    
    public PartidaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPuntuacio method, of class Partida.
     */
    @Test
    public void testGetPuntuacio() {
        System.out.println("getPuntuacio");
        Partida instance = new Partida();
        int expResult = 5;
        
        Jugada<CodiFacil> j1 = new Jugada<>();
        Jugada<CodiFacil> j2 = new Jugada<>();
        Jugada<CodiFacil> j3 = new Jugada<>(); 
        Jugada<CodiFacil> j4 = new Jugada<>();
        Jugada<CodiFacil> j5 = new Jugada<>();
        
        instance.jugades.add(j1);
        instance.jugades.add(j2);
        instance.jugades.add(j3);
        instance.jugades.add(j4);
        instance.jugades.add(j5);
        
        int result = instance.getPuntuacio();
        assertEquals(expResult, result);
        
        System.out.println("Test de getPuntuacio passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of getMode method, of class Partida.
     */
    @Test
    public void testGetMode() {
        System.out.println("getMode");
        Partida instance = new Partida();
        instance.tipusMode = "CM";
        String expResult = "CM";
        String result = instance.getMode();
        assertEquals(expResult, result);
        
        System.out.println("Test de getMode passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of introduirJugada method, of class Partida.
     */
    @Test
    public void testIntroduirJugada() {
        System.out.println("introduirJugada");
        Partida instance = new Partida();
        
        List<Integer> solucioF = new ArrayList<>();
        solucioF.add(1);
        solucioF.add(3);
        solucioF.add(5);
        solucioF.add(6);
        
        List<Integer> solucioFacilDolenta = new ArrayList();
        solucioFacilDolenta.add(2);
        solucioFacilDolenta.add(4);
        solucioFacilDolenta.add(5);
        solucioFacilDolenta.add(6);
        
        List<Integer> solucioFacilBona = new ArrayList();
        solucioFacilBona.add(1);
        solucioFacilBona.add(3);
        solucioFacilBona.add(5);
        solucioFacilBona.add(6);
        
        CodiFacil solucioFacil = new CodiFacil(solucioF);
               
        CodiFacil codiFacilDolent = new CodiFacil(solucioFacilDolenta);
        
        CodiFacil codiFacilBo = new CodiFacil(solucioFacilBona);
        
        System.out.println("\tProvant amb una solució facil 1 3 5 6...");
        instance.codiSolucio = solucioFacil;
        
        System.out.println("\tInserint un codi facil dolent 2 4 5 6...");
        Pair resultat = instance.introduirJugada(codiFacilDolent);
        Pair<Integer,Integer> correcte = new Pair(0,2);
        assertEquals(correcte, resultat);
        
        System.out.println("\tInserint un codi facil bo 1 3 5 6...");
        resultat = instance.introduirJugada(codiFacilBo);
        correcte = new Pair(0,4);
        assertEquals(correcte, resultat);
        
        System.out.println("Test de introduirJugada passat correctament");
        System.out.println("----------------------------------------");
  
    }

    /**
     * Test of calculaPuntuacio method, of class Partida.
     */
    @Test
    public void testCalculaPuntuacio() {
        System.out.println("calculaPuntuacio");
        
        Jugada<CodiFacil> j1 = new Jugada<>();
        Jugada<CodiFacil> j2 = new Jugada<>();
        Jugada<CodiFacil> j3 = new Jugada<>();
        
        Partida instance = new Partida();
        instance.jugades.add(j1);
        instance.jugades.add(j2);
        instance.jugades.add(j3);
        
        instance.calculaPuntuacio();
        
        assertEquals(instance.puntuacio,instance.jugades.size()); 
        
        System.out.println("calculaPuntuacio amb ajuda");
        instance.haDemanatAjuda = true;
        
        instance.calculaPuntuacio();
        
        assertEquals(instance.puntuacio,instance.jugades.size()+10); 
        
        System.out.println("Tests de calculaPuntuacio passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of getDificultat method, of class Partida.
     */
    @Test
    public void testGetDificultat() {
        System.out.println("getDificultat");
        Partida instance = new Partida();
        instance.dificultat = "dificil";
        String expResult = "dificil";
        String result = instance.getDificultat();
        assertEquals(expResult, result);

        System.out.println("Test de getDificultat passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of getSolucio method, of class Partida.
     */
    @Test
    public void testGetSolucio() {
        System.out.println("getSolucio");
        Partida instance = new Partida();
        List<Integer> solucio = new ArrayList<>();
        solucio.add(1);
        solucio.add(2);
        solucio.add(5);
        solucio.add(3);
        CodiFacil codi = new CodiFacil(solucio);
        instance.codiSolucio = codi;
        System.out.println("\tProvant amb una solució facil 1 2 5 3...");
        List<Integer> expResult = solucio;
        List<Integer> result = instance.getSolucio();
        assertEquals(expResult, result);
        System.out.println("Test de getSolucio passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of getJugades method, of class Partida.
     */
    @Test
    public void testGetJugades() {
        System.out.println("getJugades");
        Partida instance = new Partida();
        List<Pair<List<Integer>, Pair<Integer, Integer>>> expResult = new ArrayList<>();
        List<Integer> solucio = new ArrayList<>();
        solucio.add(1);
        solucio.add(3);
        solucio.add(5);
        solucio.add(6);
        CodiFacil codi = new CodiFacil(solucio);
        instance.codiSolucio = codi;
        System.out.println("\tProvant amb una solució facil 1 3 5 6...");
        List<Integer> jug = new ArrayList<>();
        jug.add(1);
        jug.add(3);
        jug.add(5);
        jug.add(6);
        CodiFacil codiJug = new CodiFacil(jug);
        instance.introduirJugada(codiJug);
        Pair<Integer,Integer> res = new Pair(0,4);
        
        Pair<List<Integer>, Pair<Integer, Integer>> a = new Pair(jug,res);
        expResult.add(a);
        
        
        List<Pair<List<Integer>, Pair<Integer, Integer>>> result = instance.getJugades();
        
        
        
        assertEquals(expResult, result);
        System.out.println("Test de getJugades passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of getDemanatAjuda method, of class Partida.
     */
    @Test
    public void testGetDemanatAjuda() {
        System.out.println("getDemanatAjuda");
        Partida instance = new Partida();
        instance.haDemanatAjuda = Boolean.TRUE;
        Boolean expResult = Boolean.TRUE;
        Boolean result = instance.getDemanatAjuda();
        assertEquals(expResult, result);
        System.out.println("Test de getDemanatAjuda passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of jugarPartidaCM method, of class Partida.
     */
    @Test
    public void testJugarPartidaCM() {
        System.out.println("jugarPartidaCM");
        Partida instance = new Partida();
        List<Integer> solucio = new ArrayList();
        solucio.add(6);
        solucio.add(3);
        solucio.add(4);
        solucio.add(2);
        CodiFacil solucioFacil = new CodiFacil(solucio);
        System.out.println("\tProvant amb una solució facil 6 3 4 2...");
        instance.codiSolucio = solucioFacil;
        instance.dificultat = "facil";
        List<Pair<List<Integer>, Pair<Integer, Integer>>> expResult = null;
        List<Pair<List<Integer>, Pair<Integer, Integer>>> result = instance.jugarPartidaCM();
        
        
        
        assertEquals(solucio, result.get(result.size()-1).getLeft());
        System.out.println("Test de jugarPartidaCM passat correctament");
        System.out.println("----------------------------------------");
    }

    /**
     * Test of bolaAmbAjuda method, of class Partida.
     */
    @Test
    public void testBolaAmbAjuda() {
        System.out.println("bolaAmbAjuda");
        Partida instance = new Partida();
        instance.tipusMode = "CB";
        List<Integer> solucio = new ArrayList();
        solucio.add(5);
        solucio.add(1);
        solucio.add(2);
        solucio.add(4);
        CodiFacil solucioFacil = new CodiFacil(solucio);
        instance.codiSolucio = solucioFacil;
        System.out.println("\tProvant amb una solució facil 5 1 2 6...");
        
        List<Integer> jug = new ArrayList<>();
        jug.add(1);
        jug.add(3);
        jug.add(5);
        jug.add(4);
        CodiFacil codiJug = new CodiFacil(jug);
        instance.introduirJugada(codiJug);
        
        
        int expResult = 0;
        int result = instance.bolaAmbAjuda();
        assertTrue("",result != -1 && result != 0);
        
        System.out.println("Test de BolaAmbAjuda passat correctament");
        System.out.println("----------------------------------------");
    }
    
}
