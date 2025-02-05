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
public class DPoisson {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        double lamb,t,tt,unid,ar,ab;
        double dist;
        int j,x,a,i,limi;
        boolean repetir;
        repetir=true;
        dist=0;
        ab=1;

        
        //pedimos datos
        System.out.println("Por favor digite la media:");
        System.out.println("Ocurren tantos eventos l: ");
        lamb=l.nextDouble();
        System.out.println("en tantas unidades t:");
        t=l.nextDouble();
        unid=lamb/t;
        System.out.println("Por favor digite con cuantas unidades t trabajaremos:");
        tt=l.nextDouble();
        unid*=tt;
        
        
        
        
        
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
            ar=Math.pow(Math.E,-unid)*Math.pow(unid,x);
            for(i=0;i<x;i++){
                ab*=x-i;
            }
            dist=ar/ab;
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        
        
        
        
        
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                ab=1;
                ar=Math.pow(Math.E,-unid)*Math.pow(unid,i);
                for(j=0;j<i;j++){
                    ab*=i-j;
                }
                dist+=ar/ab;
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }
    }

    public void dist(double unidad,double tt){
        System.out.println("Bienvenido al sector Poisson");
        double unid,ar,ab;
        double dist;
        int j,x,a,i,limi;
        boolean repetir;
        repetir=true;
        dist=0;
        ab=1;
        unid=unidad;
        unid*=tt;
        
        
        
        
        
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
            ar=Math.pow(Math.E,-unid)*Math.pow(unid,x);
            for(i=0;i<x;i++){
                ab*=x-i;
            }
            dist=ar/ab;
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        
        
        
        
        
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            for(i=limi;i<=x;i++){
                ab=1;
                ar=Math.pow(Math.E,-unid)*Math.pow(unid,i);
                for(j=0;j<i;j++){
                    ab*=i-j;
                }
                dist+=ar/ab;
            }
            System.out.println("La probabilidad acumulada es:"+dist);
        }
    }
}
