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
public class DBHipergeometrica {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        double dist;
        int Nt,n,k,x;
        

        dist=0;
        
        
        
        //pedimos datos
        System.out.println("Por favor digite el numero total de elementos N:");
        Nt=l.nextInt();
        System.out.println("Por favor digite el tamaño de la muestra n:");
        n=l.nextInt();
        System.out.println("Por favor digite el numero de exitos k:");
        k=l.nextInt();
        
        

        
        
        //por si K=N
        if(Nt==k){
            System.out.println("La probabilidad es 1");
        }
        
        double dif;
        dif=(double) n/Nt;
        if((dif)<0.1){
            System.out.println("Como N es muy elevado respecto a n procederemos a enviarlo al sector de la distribucion Binomial");
            System.out.println("Enviando...");
            double p=(double)k/Nt;
            DBinomial B=new DBinomial();
            B.dist(p, n);
            System.exit(0);
        }
        
        
        
        
        //procedemos a resolver
        System.out.println("Digite x:");
        x=l.nextInt();
        dist=(float) (c.Comb(k, x)*c.Comb(Nt-k, n-x))/c.Comb(Nt, n);
        System.out.println("La probabilidad de que suceda dicho evento es:"+dist);

        
    }
}
