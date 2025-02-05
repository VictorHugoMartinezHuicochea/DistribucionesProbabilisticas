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
public class DGamma {
    Scanner l=new Scanner(System.in);
    OP_IntSimpson inte=new OP_IntSimpson();
    
    
    public void dist(){
        int t,i;
        double dist,a,b,af,limi,x;
        boolean repetir;
        repetir=true;
        dist=0;
        //pedimos datos
        System.out.println("Por favor digite el valor entre cada suceso (beta):");
        b=l.nextDouble();
        System.out.println("Por favor digite el valor de cuantos elementos sucedieron (alfa):");
        a=l.nextDouble();
        
        
        //Exponencial
        if(a==1){
            System.out.println("Como alfa es 1 procederemos a enviarlo al sector de la distribucion exponencial");
            System.out.println("Enviando...");
            DExponencial E=new DExponencial();
            E.dist(b);
            System.exit(0);
        }
        
        
        
        //sacamos la funcion gamma de alfa
        af=1;
        for(i=0;i<a;i++){
            af*=a-i;
        }
        af/=a;
        
        
        
        System.out.println("Desea sacar area entre dos intervalos(1), o debajo de un solo intervalo(2): ");
        t=l.nextInt();
        repetir=true;
        while(repetir==true){
        switch(t){
            case 1:
                repetir=false;
                break;
            case 2:
                repetir=false;
                break;
            default:
                System.out.println("Por favor ingrese un numero valido");
                t=l.nextInt();
        }
            
            //sacamos limite inferior<x<limite superior
            if(t==1){
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextDouble();
            System.out.println("Por favor digite limite superior:");
            x=l.nextDouble();
            inte.setLimites(limi, x);
            dist=inte.Intgam(a, b, af);
            System.out.println("La probabilidad acumulada es: "+dist);
            }
            else{
                System.out.println("Por favor digite x:");
                x=l.nextDouble();
                limi=0;
                inte.setLimites(limi, x);
                dist=inte.Intgam(a, b, af);
                System.out.println("La probabilidad acumulada es: "+dist);
            }
        }

        
    }
}
