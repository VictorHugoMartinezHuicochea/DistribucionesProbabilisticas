/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author megah
 */
public class OP_IntSimpson_Formulas {
    public double Prueba(double x){
        double res=Math.pow(x,2);
        return res;
    }
    public double Norm(double x,double m,double de){
        double res=(1/(Math.sqrt(2*Math.PI*de)))*(Math.pow(Math.E,-((1/(2*Math.pow(de,2)))*(Math.pow((x-m), 2)))));
        return res;
    }
    
    public double Gam(double af,double a,double b,double x){
        double res=(1/(af*Math.pow(b,a)))*Math.pow(x,(a-1))*Math.pow(Math.E,-(x/b));
        return res;
    }
    
    public double Exp(double b,double x){
        double res=(1/b)*Math.pow(Math.E,-(x/b));
        return res;
    }
}
