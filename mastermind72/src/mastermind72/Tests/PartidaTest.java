/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind72.Tests;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author albert.carreira
 */
public class PartidaTest {
    
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
    }

    /**
     * Test of algoritmeJugada method, of class Partida.
     */
    
    @Ignore("Temps d'execució excessiu")
    public void testAlgoritmeJugada() {
        System.out.println("algoritmeJugada");
        Partida instance = new Partida();
        
        List<Integer> solucioF = new ArrayList<>();
        solucioF.add(1);
        solucioF.add(3);
        solucioF.add(5);
        solucioF.add(6);
        
        List<Integer> solucioD = new ArrayList<>();
        solucioD.add(1);
        solucioD.add(3);
        solucioD.add(5);
        solucioD.add(6);
        solucioD.add(2);
        solucioD.add(4);
        
        CodiFacil solucioFacil = new CodiFacil(solucioF);
        CodiDificil solucioDificil = new CodiDificil(solucioD);
        
        System.out.println("\tProvant el CM amb una solucio facil...");
        instance.codiSolucio = solucioFacil;
        instance.dificultat = "facil";
        instance.algoritmeJugada();
        
        System.out.println("\tProvant el CM amb una solucio dificil...");
        instance.codiSolucio = solucioDificil;
        instance.dificultat = "dificil";
        instance.algoritmeJugada();    
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
        
        List<Integer> solucioD = new ArrayList<>();
        solucioD.add(1);
        solucioD.add(3);
        solucioD.add(5);
        solucioD.add(6);
        solucioD.add(2);
        solucioD.add(4);
        
        List<Integer> solucioDificilDolenta = new ArrayList();
        solucioDificilDolenta.add(2);
        solucioDificilDolenta.add(4);
        solucioDificilDolenta.add(5);
        solucioDificilDolenta.add(6);
        solucioDificilDolenta.add(1);
        solucioDificilDolenta.add(3);
        
        List<Integer> solucioDificilBona = new ArrayList();
        solucioDificilBona.add(1);
        solucioDificilBona.add(3);
        solucioDificilBona.add(5);
        solucioDificilBona.add(6);
        solucioDificilBona.add(2);
        solucioDificilBona.add(4);
        
        CodiFacil solucioFacil = new CodiFacil(solucioF);
               
        CodiFacil codiFacilDolent = new CodiFacil(solucioFacilDolenta);
        
        CodiFacil codiFacilBo = new CodiFacil(solucioFacilBona);
        
        CodiDificil solucioDificil = new CodiDificil(solucioD);
        
        CodiDificil codiDificilDolent = new CodiDificil(solucioDificilDolenta);
 
        CodiDificil codiDificilBo = new CodiDificil(solucioDificilBona);
        
        Boolean resultat;
        
        System.out.println("\tProvant amb una solució facil...");
        instance.codiSolucio = solucioFacil;
        
        System.out.println("\tInserint un codi facil dolent...");
        resultat = instance.introduirJugada(codiFacilDolent);
        assertEquals(Boolean.FALSE, resultat);
        
        System.out.println("\tInserint un codi facil bo...");
        resultat = instance.introduirJugada(codiFacilBo);
        assertEquals(Boolean.TRUE, resultat);
        
        System.out.println("\tProvant amb una solució difícil...");
        instance.codiSolucio = solucioDificil;
        
        System.out.println("\tInserint un codi difícil dolent...");
        resultat = instance.introduirJugada(codiDificilDolent);
        assertEquals(Boolean.FALSE, resultat);
        
        System.out.println("\tInserint un codi difícil bo...");
        resultat = instance.introduirJugada(codiDificilBo);
        assertEquals(Boolean.TRUE, resultat);
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
    }
    
}
