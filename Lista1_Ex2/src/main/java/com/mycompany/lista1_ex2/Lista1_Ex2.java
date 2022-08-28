
package com.mycompany.lista1_ex2;

import java.util.Scanner;

public class Lista1_Ex2{
     
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        float R, S, T;
        
        System.out.println("Digite valores para R, S e T.");
        R = teclado.nextFloat();
        S = teclado.nextFloat();
        T = teclado.nextFloat();
        
        if (R > S && R > T){
            System.out.println("O "+R+" e o maior");
        }
        if (S > R && S > T){
            System.out.println("O "+S+" e o maior");
        }
        if (T > S && T > R){
            System.out.println("O "+T+" e o maior");
        }
    }  
            
}