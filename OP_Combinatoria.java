/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author megah
 */
public class OP_Combinatoria {
    int i,r;
    double res, nf,xf,nx;
    
    
    
    //por valor long, no puede superar n a 20
    public double Comb(int n, int x){
        int aux;
        nf=1;
        xf=1;
        nx=1;
        aux=n-x;
        for(i=0;i<n;i++){
            nf*=n-i;
        }
        for(i=0;i<x;i++){
            xf*=x-i;
        }
        for(i=0;i<aux;i++){
            nx*=aux-i;
        }
        
        res=nf/(xf*nx);
        return res;
    }
    
    
    public double Combmult(int cp,int ev, int[] evind){
        int j;
        nf=1;
        xf=1;
        double[] fact=new double[cp+1];
        for(i=0;i<cp+1;i++){
            fact[i]=1;
        }
        
        for(i=0;i<ev;i++){
            nf*=ev-i;
        }
        for(i=1;i<=cp;i++){
            for(j=0;j<evind[i];j++){
                fact[i]*=evind[i]-j;
            }
        }
        
        for(i=1;i<=cp;i++){
            xf*=fact[i];
        }
        
        res=nf/xf;

        return res;
    }
}
