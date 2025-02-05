/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author megah
 */
public class DMultinomial {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        
        
        double dist,pev;
        int i,cp,ev;
        pev=1;
        //pedimos datos
        System.out.println("Por favor digite cuantas probabilidades n hay: ");
        cp=l.nextInt();
        double[] p=new double[cp+1];
        int[] evind=new int[cp+1];
        
        System.out.println("Por favor digite las probabilidades");
        for(i=1;i<=cp;i++){
            System.out.println("P"+i+":");
            p[i]=l.nextDouble();
        }
        
        System.out.println("Por favor digite el total de eventos");
        ev=l.nextInt();
        System.out.println("Por favor digite los eventos individuales");
        for(i=1;i<=cp;i++){
            System.out.println("evento perteneciente a P"+i+":");
            evind[i]=l.nextInt();
        }
        
        //calculamos las multiplicaciones exeptuando combinatoria
        for(i=1;i<=cp;i++){
            pev*=Math.pow(p[i], evind[i]);
        }
        
        //implementamos la combinatorial
        dist=c.Combmult(cp, ev, evind)*pev;
        
        System.out.println("La probabilidad de que suceda dicho evento es:"+dist);

        
    }
}
