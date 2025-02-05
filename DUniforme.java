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
public class DUniforme {
    Scanner l=new Scanner(System.in);
    OP_Combinatoria c=new OP_Combinatoria();
    
    
    public void dist(){
        
        
        double dist,x,b,a,limi;
        int t;
        boolean repetir;
        repetir=true;
        dist=0;
        //pedimos datos
        System.out.println("Por favor digite el limite inferior del Intervalo (A):");
        a=l.nextDouble();
        System.out.println("Por favor digite el limite superior del Intervalo (B):");
        b=l.nextInt();

        
        //acumulada o sola
        System.out.println("Por favor digite si desea la sola(1) o acumulada(2)");
        t=l.nextInt();
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
        }
  
        
        //sacamos la individual
        if(t==1){
            System.out.println("Digite x:");
            x=l.nextInt();
            if(x<a || x>b){
                System.out.println("La probabilidad de que suceda dicho evento es: 0");
            }
            else{
                dist=1/(b-a);
                System.out.println("La probabilidad es:"+dist);
            }
            
        }
        //sacamos la acumulada
        else{
            System.out.println("Por favor digite el limite inferior:");
            limi=l.nextInt();
            System.out.println("Por favor digite limite superior:");
            x=l.nextInt();
            
            if(x<a){
                System.out.println("La probabilidad acumulada es de: 0");
            }
            else{
                if(x>b){
                    System.out.println("La probabilidad acumulada es de: 1");
                }
                else{
                    if(limi<=a){
                        dist=(x-a)*(1/b-a);
                    }
                    else{
                        dist=(x-limi)*(1/b-a);
                    }
                    System.out.println("La probabilidad acumulada es:"+dist);
                }
            }
        }
            
        }
    }
