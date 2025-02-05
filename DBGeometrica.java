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
public class DBGeometrica {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        
        
        double dist,p,q;
        int x,a,i,limi;
        boolean repetir;
        repetir=true;
        dist=0;
        
        
        //pedimos datos
        System.out.println("Por favor digite la probabilida p:");
        p=l.nextDouble();
        
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
                
        //obtenemos q
        q=1-p;
        
        
        
        //sacamos la individual
        if(a==1){
            System.out.println("Digite x:");
            x=l.nextInt();
            dist=p*Math.pow(q,(x-1));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                dist+=p*Math.pow(q,(i-1));
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }
    
    }
    
    public void dist(double p){
        System.out.println("Bienvenido al sector de la binomial geometrica");
        
        double dist,q;
        int x,a,i,limi;
        boolean repetir;
        repetir=true;
        dist=0;
        
        
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
                
        //obtenemos q
        q=1-p;
        
        
        
        //sacamos la individual
        if(a==1){
            System.out.println("Digite x:");
            x=l.nextInt();
            dist=p*Math.pow(q,(x-1));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                dist+=p*Math.pow(q,(i-1));
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }
    
    }
}
