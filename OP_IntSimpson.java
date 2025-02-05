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
public class OP_IntSimpson {
    OP_IntSimpson_Formulas F=new OP_IntSimpson_Formulas();
    Scanner l=new Scanner(System.in);
    double a,b;
    public void setLimites (double a, double b){
        while(a>b){
            System.out.println("Los limites de integracion estan mal o al revez, digitelos de nuevo:");
            System.out.println("Limite inferior");
            a=l.nextDouble();
            System.out.println("Limite superior");
            b=l.nextDouble();
        }
        this.a=a;
        this.b=b;
    }
    
    public double k(double a,double b){
        
        double h,tot;
        int i;
        double[] x=new double [1000001];
        h=(b-a)/1000000f;
        x[0]=a;
        tot=0;

        for(i=1;i<=1000000;i++){
            x[i]=a+h*i;
        }

        for(i=1; i<=1000000/3; i++){
            tot += F.Prueba(x[3*i - 3]) + 3*F.Prueba(x[3*i - 2]) +3*F.Prueba(x[3*i-1])+F.Prueba(x[3*i]);
	}
        
        
        tot=3*tot*h/8;
        return tot;
    }
    
    
    
    public double Intnorm(double m,double de){
        double h,tot;
        int i;
        double[] x=new double [1000001];
        h=(b-a)/1000000f;
        x[0]=a;
        tot=0;

        for(i=1;i<=1000000;i++){
            x[i]=a+h*i;
        }

        for(i=1; i<=1000000/3; i++){
            tot += F.Norm(x[3*i - 3],m,de) + 3*F.Norm(x[3*i - 2],m,de) +3*F.Norm(x[3*i-1],m,de)+F.Norm(x[3*i],m,de);
	}
        
        
        tot=3*tot*h/8;
        return tot;
    }
    
    public double Intgam(double al,double be,double alf){
        double h,tot;
        int i;
        double[] x=new double [1000001];
        h=(b-a)/1000000f;
        x[0]=a;
        tot=0;

        for(i=1;i<=1000000;i++){
            x[i]=a+h*i;
        }

        for(i=1; i<=1000000/3; i++){
            tot += F.Gam(alf,al,be,x[3*i - 3]) + 3*F.Gam(alf,al,be,x[3*i - 2]) +3*F.Gam(alf,al,be,x[3*i-1])+F.Gam(alf,al,be,x[3*i]);
	}
        
        
        tot=3*tot*h/8;
        return tot;
    }
    
    public double Intexp(double be){
        double h,tot;
        int i;
        double[] x=new double [1000001];
        h=(b-a)/1000000f;
        x[0]=a;
        tot=0;

        for(i=1;i<=1000000;i++){
            x[i]=a+h*i;
        }

        for(i=1; i<=1000000/3; i++){
            tot += F.Exp(be,x[3*i - 3]) + 3*F.Exp(be,x[3*i - 2]) +3*F.Exp(be,x[3*i-1])+F.Exp(be,x[3*i]);
	}
        
        
        tot=3*tot*h/8;
        return tot;
    }
    
}
