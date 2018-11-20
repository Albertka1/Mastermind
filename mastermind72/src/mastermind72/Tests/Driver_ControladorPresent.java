/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mastermind72.Presentacio;

import java.util.ArrayList;

/**
 *
 * @author albert
 */
public class Driver_ControladorPresent {
    public static void main(String args[]){
        System.out.println("Driver Presentació");
        ControladorPresentacio cPresentacio = new ControladorPresentacio();
        
        System.out.println("Probant transicions:");
        System.out.println("--------------------");
        System.out.println("Inicialitzant presentació...");
        cPresentacio.inicialitzarPresentacio();
        espera();
        
        System.out.println("\nActivant vista ajuda del menú principal...");
        cPresentacio.sincroMenuPrincipal_a_Ajuda();
        espera();
        System.out.println("Tornant de la vista ajuda al menú principal...");
        cPresentacio.sincroAjuda_a_MenuPrincipal();
        espera();
        
        System.out.println("\nActivant vista carregar partida del menú principal...");
        cPresentacio.sincroMenuPrincipal_a_CarregarPartida();
        espera();
        System.out.println("Tornant de la vista carregar partida al menú principal...");
        cPresentacio.sincroCarregarPartida_a_MenuPrincipal();
        espera();
        
        System.out.println("\nActivant vista rankings del menú principal...");
        cPresentacio.sincroMenuPrincipal_a_Rankings();
        espera();
        System.out.println("Tornant de la vista rankings a al menú principal...");
        cPresentacio.sincroRankings_a_MenuPrincipal();
        espera();
        
        System.out.println("\nActivant vista nova partida del menú principal...");
        cPresentacio.sincroMenuPrincipal_a_NovaPartida();
        espera();
        System.out.println("Tornant de la vista nova partida a al menú principal...");
        cPresentacio.sincroNovaPartida_a_MenuPrincipal();
        espera();
        
        System.out.println("\nActivant vista nova partida del menú principal...");
        cPresentacio.sincroMenuPrincipal_a_NovaPartida();
        espera();
        System.out.println("\nActivant vista intro maker de nova partida amb dificultat fàcil...");
        cPresentacio.sincroNovaPartida_a_IntroMaker("facil");
        espera();
        System.out.println("Tornant de la vista intro maker a nova partida...");
        cPresentacio.sincroIntroMaker_a_NovaPartida();
        espera();
        System.out.println("\nActivant vista intro maker de nova partida amb dificultat difícil...");
        cPresentacio.sincroNovaPartida_a_IntroMaker("dificil");
        espera();
        System.out.println("Tornant de la vista intro maker a nova partida...");
        cPresentacio.sincroIntroMaker_a_NovaPartida();
        espera();
        System.out.println("\nActivant vista partida des de nova partida amb dificultat fàcil...");
        cPresentacio.cridaControladorPartida_CrearPartida("facil", "CB", new ArrayList<>());
        cPresentacio.sincroNovaPartida_a_Partida("facil");
        espera();
        System.out.println("Tornant de la vista partida a menu principal...");
        cPresentacio.sincroPartida_a_MenuPrincipal();
        espera();
        cPresentacio.sincroMenuPrincipal_a_NovaPartida();
        espera();
        System.out.println("\nActivant vista partida des de nova partida amb dificultat dificil...");
        cPresentacio.cridaControladorPartida_CrearPartida("dificil", "CB", new ArrayList<>());
        cPresentacio.sincroNovaPartida_a_Partida("dificil");
        espera();
        System.out.println("Tornant de la vista partida dificil a menu principal...");
        cPresentacio.sincroPartida_a_MenuPrincipal();
        espera();
        
        System.out.println("\nActivant vista bola ajuda des de partida amb bola de color taronja..");
        cPresentacio.sincroMenuPrincipal_a_NovaPartida();
        espera();
        cPresentacio.cridaControladorPartida_CrearPartida("facil", "CB", new ArrayList<>());
        cPresentacio.sincroNovaPartida_a_Partida("facil");
        espera();
        cPresentacio.sincroPartida_a_BolaAjuda(2);
        espera();
        System.out.println("Tornant de la vista bola ajuda a partida...");
        cPresentacio.sincroBolaAjuda_a_Partida();
        espera();
        
        System.out.println("\nActivant vista menu guardar des de partida (es vol abandonar la partida)...");
        cPresentacio.sincroPartida_a_MenuGuardar();
        espera();
        System.out.println("Tornant de la vista menu guardar a partida...");
        cPresentacio.sincroMenuGuardar_a_Partida();
        espera();
        
        System.out.println("\nActivant vista intro guardar des de menu guardar (es vol abandonar la partida guardant)...");
        cPresentacio.sincroPartida_a_MenuGuardar();
        espera();
        cPresentacio.sincroMenuGuardar_a_IntroGuardar();
        espera();
        System.out.println("Tornant de la vista intro guardar a menu guardar...");
        cPresentacio.sincroIntroGuardar_a_Partida();
        espera();
        
        System.out.println("\nActivant vista menu principal des de intro guardar (es vol abandonar la partida guardant)...");
        cPresentacio.sincroPartida_a_MenuGuardar();
        espera();
        cPresentacio.sincroMenuGuardar_a_IntroGuardar();
        espera();
        cPresentacio.sincroIntroGuardar_a_MenuPrincipal("Nom de la partida a guardar");
        espera();
        
        System.out.println("\nActivant vista menu principal des de menu guardar (es vol abandonar la partida sense guardar)...");
        cPresentacio.sincroMenuPrincipal_a_NovaPartida();
        espera();
        cPresentacio.cridaControladorPartida_CrearPartida("facil", "CB", new ArrayList<>());
        cPresentacio.sincroNovaPartida_a_Partida("fàcil");
        espera();
        cPresentacio.sincroPartida_a_MenuGuardar();
        espera();
        cPresentacio.sincroMenuGuardar_a_MenuPrincipal();
        espera();
        
        System.out.println("\nFinalitzant presentació...");
        cPresentacio.finalitzarPresentacio();
        
        System.out.println("Test completat correctament");
    }
    private static void espera(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
