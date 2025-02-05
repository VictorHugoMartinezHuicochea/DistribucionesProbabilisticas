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
public class DBNegativa {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        
        
        double dist,p,q;
        int k,x,a,i,limi;
        
        
        boolean repetir;
        repetir=true;
        dist=0;
        //pedimos datos
        System.out.println("Por favor digite la probabilida p:");
        p=l.nextDouble();
        System.out.println("Por favor digite los exitos deseados k:");
        k=l.nextInt();
        while(repetir==true){
                repetir=false;
                if (k<1){
                    System.out.println("Recuerda que k debe ser mayor o igual a 1");
                    System.out.println("Por favor ingrese otro valor a k");
                    k=l.nextInt();
                    repetir=true;
                }
        }
        
        
        if(k==1){
            System.out.println("Como k es 1 procederemos a enviarlo al sector de la distribucion binomial geometrica");
            System.out.println("Enviando...");
            DBGeometrica G=new DBGeometrica();
            G.dist(p);
            System.exit(0);
        }
        
        
        
        
        //acumulada o sola
        System.out.println("Por favor digite si desea la sola(1) o acumulada(2)");
        a=l.nextInt();
        repetir=true;
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
            repetir=true;
            while(repetir==true){
                repetir=false;
                if (k>x){
                    System.out.println("Recuerda que x debe ser mayor o igual a k");
                    System.out.println("Por favor ingrese otro valor a x");
                    x=l.nextInt();
                    repetir=true;
                }
            }
            
            dist=c.Comb(x-1, k-1)*(Math.pow(p,k))*Math.pow(q,(x-k));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        
        
        
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            repetir=true;
            while(repetir==true){
                repetir=false;
                if (k>limi){
                    System.out.println("Recuerda que el limite inferior debe ser mayor o igual a k");
                    System.out.println("Por favor ingrese otro valor");
                    limi=l.nextInt();
                    repetir=true;
                }
            }
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                dist+=c.Comb(i-1, k-1)*(Math.pow(p,k))*Math.pow(q,(i-k));
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }
    }
}
