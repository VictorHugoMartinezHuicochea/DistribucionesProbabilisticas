/*
 * Programa para obtener las probabilidades de una distribucion.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author megah
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos las cosas necesarias del programa y definimos variables
        EEscritos e=new EEscritos();
        Scanner d=new Scanner(System.in);
        boolean repetir;
        String d1;
        
        // Presentacion
        e.Presentacion();
        System.out.println();
        System.out.println("Por favor digame que desea hacer");
        e.Menu();
        System.out.println("Ingrese la letra de tu distribucion: (En minusculas)");
        d1=d.nextLine();
        
        //por si suceden problemas con los datos
        repetir=true;
        
        //Mandamos el problema a los demas
        while(repetir==true){
            switch(d1){
                case "a":
                    System.out.println("Usted ha elegido una Distribucion Binomial:");
                    DBinomial DB=new DBinomial();
                    DB.dist();
                    repetir=false;
                    break;
                case "b":
                    System.out.println("Usted ha elegido una Distribucion Multinomial");
                    DMultinomial DM=new DMultinomial();
                    DM.dist();
                    repetir=false;
                    break;
                case "c":
                    System.out.println("Usted ha elegido una Distribucion Binomial Hipergeometrica");
                    DBHipergeometrica DBH=new DBHipergeometrica();
                    DBH.dist();
                    repetir=false;
                    break;
                case "d":
                    System.out.println("Usted ha elegido una Distribucion Multinomial Hipergeometrica");
                    DMHipergeometrica DMH=new DMHipergeometrica();
                    DMH.dist();
                    repetir=false;
                    break;
                case "e":
                    System.out.println("Usted ha elegido una Distribucion Binomial Negativa");
                    DBNegativa DBN=new DBNegativa();
                    DBN.dist();
                    repetir=false;
                    break;
                case "f":
                    System.out.println("Usted ha elegido una Distribucion Binomial Geometrica");
                    DBGeometrica DBG=new DBGeometrica();
                    DBG.dist();
                    repetir=false;
                    break;
                case "g":
                    System.out.println("Usted ha elegido una Distribucion de Poisson");
                    DPoisson DP=new DPoisson();
                    DP.dist();
                    repetir=false;
                    break;
                case "h":
                    System.out.println("Usted ha elegido una Distribucion Uniforme");
                    DUniforme DU=new DUniforme();
                    DU.dist();
                    repetir=false;
                    break;
                case "i":
                    System.out.println("Usted ha elegido una Distribucion Normal");
                    DNormal DN=new DNormal();
                    DN.dist();
                    repetir=false;
                    break;
                case "j":
                    System.out.println("Usted ha elegido una Distribucion Gamma");
                    DGamma DG=new DGamma();
                    DG.dist();
                    repetir=false;
                    break;
                case "k":
                    System.out.println("Usted ha elegido una Distribucion Exponencial");
                    DExponencial DE=new DExponencial();
                    DE.dist();
                    repetir=false;
                    break;
                default:
                    System.out.println("Ingrese algo valido");
                    System.out.println("Ingrese la letra de tu distribucion:");
                    d1=d.nextLine();           
            }
        }
  
    }
    
}
