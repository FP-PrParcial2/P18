/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema018;
import java.util.*;
/**
 *
 * @author karen
 18.	Realizar un programa que contenga una función que calcule el mínimo común múltiplo de tres números*/
public class PPProblema018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3, N;
        int mcm;
        n1=pedirNum();
        
    }

    public static int pedirNum() {
        int n1,n2,n3;
        System.out.println("Introduce el primer número");
        Scanner entrada= new Scanner(System.in);
        n1=entrada.nextInt();
        System.out.println("Introduce el segundo número");
        n2=entrada.nextInt();
        System.out.println("Introduce el tercer número");
        n3=entrada.nextInt();
        int N;
        N=(n1*n2*n3);
       System.out.println("El MCM de:" + n1 + "," + n2 + "," + n3 + "," + "es =" + N);
       return N;
        }
 
    
    }

   
    

