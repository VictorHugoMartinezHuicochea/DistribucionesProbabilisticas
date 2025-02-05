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
public class DMHipergeometrica {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        double dist,ar;
        int Nt,cp,i, n;
        
        ar=1;
        dist=0;
        
        
        
        //pedimos datos
        System.out.println("Por favor digite el numero total de elementos N:");
        Nt=l.nextInt();
        System.out.println("Por favor digite cuantos elementos distintos hay: ");
        cp=l.nextInt();
        double[] p=new double[cp+1];
        int[] elind=new int[cp+1];
        int[] evind=new int[cp+1];
        System.out.println("Por favor digite la cantidad de elementos:");
        for(i=1;i<=cp;i++){
            System.out.println("Cuantos eventos del Elemento "+i+" son: ");
            elind[i]=l.nextInt();
        }
        //pedimos datos de la muestra
        System.out.println("Por favor digite el tamaño de la muestra n:");
        n=l.nextInt();
        System.out.println("Por favor digite el numero deseado de cada elemto:");
        for(i=1;i<=cp;i++){
            System.out.println("Cuantos eventos del Elemento "+i+" requiere: ");
            evind[i]=l.nextInt();
        }
        
        
        //calculamos combinatoria de cada evento
        for(i=1;i<=cp;i++){
            ar*=c.Comb(elind[i], evind[i]);
        }
        
        //caculamos total
        dist=(float)ar/c.Comb(Nt, n);
        System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
    }
}
