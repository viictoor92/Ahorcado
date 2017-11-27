/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugador j1=new Jugador();
        Jugador j2=new Jugador();
        Scanner teclado=new Scanner(System.in);
                Scanner teclado2=new Scanner(System.in);
        String p1,p2,p3,p4;
        ArrayList Palabras1=new ArrayList();
        ArrayList Palabras2=new ArrayList();
        
        j1.setSaldo(6);
        j2.setSaldo(6);
        int s1,s2=0;
        System.out.println("Introduzca la palabra del jugador1: ");
        p1=teclado.nextLine();
        for (int i = 0; i < 10; i++) {
        System.out.println("\n");
            
        }
        System.out.println("Introduzca la palabra del jugador2: ");
        p2=teclado.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
        j1.setPalabra(p1);
        j2.setPalabra(p2);
        int i=0;
        while(j1.getSaldo()>=0 && j2.getSaldo()>=0 && !j1.ganar() && !j2.ganar())
        {
            if(i%2==0)
            {
                for (int j = 0; j < 10; j++) {
                    System.out.println("\n");
                }
                s1=j1.getSaldo();
                System.out.println("********* TURNO JUGADOR 2 ***** VIDAS: " + s1 + "**\n"
                        + "LETRAS ERRONEAS: ");
                for (int j = 0; j < Palabras2.size(); j++) {
                    System.out.println(Palabras2.get(j).toString());
                }
            System.out.println("PALABRA QUE DEBES ACERTAR: "+j1.getRespuesta());
                            System.out.println("INTRODUZCA UNA LERA: ");
                p4=teclado2.nextLine();
                j1.realizarApuesta(1, p4);
                s2=j1.getSaldo();
                System.out.println("\n"+j1.getRespuesta() + " VIDAS: " + s2);
                
                if(s1-s2>0 && !j1.ganar())
                {
                    System.out.println("ERES MALISIMO!! HAS PERDIDO UNA VIDA\n\nPulse una tecla para continuar...");
                                        teclado.nextLine();

                    boolean encontrado=false;
                    int l=0;
                    while(!encontrado && l<Palabras2.size())
                    {
                        if(Palabras2.get(l).toString().equals(p4))
                            encontrado=true;
                        
                        l++;
                            }
                    if(!encontrado)
                    {
                        Palabras2.add(p4);
                }
                    
                }
                else if(!j1.ganar())
                {
           
                    System.out.println("HAS ACERTADO\n\nPulse una tecla para continuar...");
                    teclado2.nextLine();
                }
                        
                
                
               
            }
            else
            {
                for (int j = 0; j < 10; j++) {
                    System.out.println("\n");
                }
                s1=j2.getSaldo();
                System.out.println("********* TURNO JUGADOR 1 ***** VIDAS: " + s1 + "**\n"
                        + "LETRAS ERRONEAS: ");
                for (int j = 0; j < Palabras1.size(); j++) {
                    System.out.println(Palabras1.get(j).toString());
                }
                System.out.println("PALABRA QUE DEBES ACERTAR: "+j2.getRespuesta());
                System.out.println("INTRODUZCA UNA LERA: ");
                p3=teclado2.nextLine();
                j2.realizarApuesta(1, p3);
                s2=j2.getSaldo();
                System.out.println(j2.getRespuesta() + " VIDAS: " + s2);
                
                if(s1-s2>0 && !j2.ganar())
                {
                    System.out.println("ERES MALISIMO!! HAS PERDIDO UNA VIDA\n\nPulse una tecla para continuar...");
                                        teclado.nextLine();

                    boolean encontrado=false;
                    int l=0;
                    while(!encontrado && l<Palabras1.size())
                    {
                        
                        if(Palabras1.get(l).toString().equals(p3))
                            encontrado=true;
                        
                        l++;
                            }
                    if(!encontrado)
                    {   Palabras1.add(p3);
                }
                    
                }
                else if(!j2.ganar())
                {
                    System.out.println("HAS ACERTADO\n\nPulse una tecla para continuar...");
                    teclado2.nextLine();
                }
                
            }
            i++;
            }
        
        if(j1.ganar() && j1.getSaldo()>=0)
        {
            System.out.println("HA GANADO EL JUGADOR 2");
        }
        else
        {
            System.out.println("HA GANADO EL JUGADOR 1");
        }
        
    }
}
    

