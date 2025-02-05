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
public class DBinomial {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        
        
        double dist,p,q;
        int n,x,a,i,limi;
        boolean repetir;
        repetir=true;
        dist=0;
        //pedimos datos
        System.out.println("Por favor digite la probabilida p:");
        p=l.nextDouble();
        System.out.println("Por favor digite el numero de eventos posibles n:");
        n=l.nextInt();
        
        
                        
        //obtenemos q
        q=1-p;
        
        
        if(n>25){
            if(p<0.25||p>0.75){
                System.out.println("Como n es muy elevado y su probabilidad se encuentra lejos del centro procederemos a enviarlo al sector de la distribucion de Poisson");
                if(p>0.75){
                    System.out.println("Como p esta cerca de 1, se intercambiaran los exitos y fracasos");
                    double auxi;
                    auxi=p;
                    p=q;
                    q=auxi;
                }
                System.out.println("Enviando...");
                DPoisson P=new DPoisson();
                P.dist(p,n);
                System.exit(0);
            }
            else{
                System.out.println("Como n es muy elevado procederemos a enviarlo al sector de la distribucion Normal");
                System.out.println("Enviando...");
                double m=n*p;
                double var=n*p*q;
                DNormal N=new DNormal();
                N.dist(m,var);
                System.exit(0);
            } 
            
        }
        
        
        
        
        //acumulada o sola
        System.out.println("Por favor digite si desea la sola(1) o acumulada(2)");
        a=l.nextInt();
        while(repetir==true){
            switch(a){
                case 1:
                    repetir=false;
                    break;
                case 2:
                    repetir=false;
                    break;
                default:
                    System.out.println("Por favor ingrese un numero valido");
                    a=l.nextInt();
            }
        }

        
        
        
        
        //sacamos la individual
        if(a==1){
            System.out.println("Digite x:");
            x=l.nextInt();
            dist=c.Comb(n, x)*(Math.pow(p,x))*Math.pow(q,(n-x));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                dist+=c.Comb(n, i)*(Math.pow(p,i))*Math.pow(q,(n-i));
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }

        
    }


    public void dist(double p,int n){
        System.out.println("Binevenido al sector Binomial");
        
        double dist,q;
        int x,a,i,limi;
        boolean repetir;
        repetir=true;
        dist=0;
        
        
       //obtenemos q
        q=1-p;
        
        
        if(n>25){
            if(p<0.25||p>0.75){
                System.out.println("Como n es muy elevado y su probabilidad se encuentra lejos del centro procederemos a enviarlo al sector de la distribucion de Poisson");
                if(p>0.75){
                    System.out.println("Como p esta cerca de 1, se intercambiaran los exitos y fracasos");
                    double auxi;
                    auxi=p;
                    p=q;
                    q=auxi;
                }
                System.out.println("Enviando...");
                DPoisson P=new DPoisson();
                P.dist(p,n);
                System.exit(0);
            }
            else{
                System.out.println("Como n es muy elevado procederemos a enviarlo al sector de la distribucion Normal");
                System.out.println("Enviando...");
                double m=n*p;
                double var=n*p*q;
                DNormal N=new DNormal();
                N.dist(m,var);
                System.exit(0);
            } 
            
        }
        
        //acumulada o sola
        System.out.println("Por favor digite si desea la sola(1) o acumulada(2)");
        a=l.nextInt();
        while(repetir==true){
            switch(a){
                case 1:
                    repetir=false;
                    break;
                case 2:
                    repetir=false;
                    break;
                default:
                    System.out.println("Por favor ingrese un numero valido");
                    a=l.nextInt();
            }
        }
                

        
        
        
        
        //sacamos la individual
        if(a==1){
            System.out.println("Digite x:");
            x=l.nextInt();
            dist=c.Comb(n, x)*(Math.pow(p,x))*Math.pow(q,(n-x));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                dist+=c.Comb(n, i)*(Math.pow(p,i))*Math.pow(q,(n-i));
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }

        
    }
}
