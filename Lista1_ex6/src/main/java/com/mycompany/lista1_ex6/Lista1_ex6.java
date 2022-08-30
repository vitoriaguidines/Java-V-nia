/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista1_ex6;


public class Lista1_ex6 {

    public static void main(String[] args) {
        
        int i = 0;
        int x = 1;
        while (i + x < 100){
            System.out.println(i);
            x += i;
            System.out.println(x);
            i += x;
        }
                
    }
}
