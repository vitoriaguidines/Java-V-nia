/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista1_ex1;

import java.util.Scanner;

public class Lista1_Ex1 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
                
        int numero,neg=0,num;
        
        System.out.println("digite quantos numeros vao ser usados");
        numero = teclado.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println("digite um numero ai");
            num = teclado.nextInt();
            
            if (num < 0){
                neg++;
            }
            
        }
        System.out.println(" o numero de negativos e "+neg);
        
    }
}