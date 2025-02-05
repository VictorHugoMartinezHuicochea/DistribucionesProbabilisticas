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
public class DNormal {
    Scanner l=new Scanner(System.in);
    OP_IntSimpson inte=new OP_IntSimpson();
    
    
    public void dist(){
        int a;
        double dist,m,de,limi,x;
        boolean repetir;
        repetir=true;
        dist=0;
        //pedimos datos
        System.out.println("Por favor digite la media m:");
        m=l.nextDouble();
        System.out.println("Por favor digite la desviacion estandar d:");
        de=l.nextDouble();
        
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
            x=l.nextDouble();
            dist=(1/(Math.sqrt(2*Math.PI*de)))*(Math.pow(Math.E,-((1/(2*Math.pow(de,2)))*(Math.pow((x-m), 2)))));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        //sacamos la acumulada
        else{
            System.out.println("Desea sacar area entre dos intervalos(1), o debajo de un solo intervalo(2): ");
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
            
            //sacamos limite inferior<x<limite superior
            if(a==1){
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextDouble();
            System.out.println("Por favor digite limite superior:");
            x=l.nextDouble();
            
            
            //evitamos errores
            while(limi>x){
            System.out.println("Los limites de integracion estan mal o al revez, digitelos de nuevo:");
            System.out.println("Limite inferior");
            limi=l.nextDouble();
            System.out.println("Limite superior");
            x=l.nextDouble();
            }
            
            //sacamos z prueba
            limi=(limi-m)/de;
            x=(x-m)/de;
            inte.setLimites(limi, x);
            dist=inte.Intnorm(0, 1);
                      
            System.out.println("La probabilidad acumulada es: "+dist);
            }
            else{
                System.out.println("Por favor digite x:");
                x=l.nextDouble();
                limi=-100;
                //sacamos z prueba
                limi=(limi-m)/de;
                x=(x-m)/de;
                inte.setLimites(limi, x);
                dist=inte.Intnorm(0, 1);
                
                System.out.println("La probabilidad acumulada es: "+dist);
            }
        }

        
    }

    public void dist(double m,double var){
        System.out.println("Bienvenido al sector Normal");
        int a;
        double dist,de,limi,x;
        boolean repetir;
        repetir=true;
        dist=0;
        
        de=Math.sqrt(var);
        
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
            x=l.nextDouble();
            dist=(1/(Math.sqrt(2*Math.PI*de)))*(Math.pow(Math.E,-((1/(2*Math.pow(de,2)))*(Math.pow((x-m), 2)))));
            System.out.println("La probabilidad de que suceda dicho evento es:"+dist);
        }
        //sacamos la acumulada
        else{
            System.out.println("Desea sacar area entre dos intervalos(1), o debajo de un solo intervalo(2): ");
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
            
            //sacamos limite inferior<x<limite superior
            if(a==1){
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextDouble();
            System.out.println("Por favor digite limite superior:");
            x=l.nextDouble();
            
            
            //evitamos errores
            while(limi>x){
            System.out.println("Los limites de integracion estan mal o al revez, digitelos de nuevo:");
            System.out.println("Limite inferior");
            limi=l.nextDouble();
            System.out.println("Limite superior");
            x=l.nextDouble();
            }
            
            //sacamos z prueba
            limi=(limi-m)/de;
            x=(x-m)/de;
            inte.setLimites(limi, x);
            dist=inte.Intnorm(0, 1);
                      
            System.out.println("La probabilidad acumulada es: "+dist);
            }
            else{
                System.out.println("Por favor digite x:");
                x=l.nextDouble();
                limi=-100;
                //sacamos z prueba
                limi=(limi-m)/de;
                x=(x-m)/de;
                inte.setLimites(limi, x);
                dist=inte.Intnorm(0, 1);
                
                System.out.println("La probabilidad acumulada es: "+dist);
            }
        }

        
    }
}
