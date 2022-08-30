/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista1_ex7;
import java.util.Scanner;

public class Lista1_Ex7 {

    public static void main(String[] args) {
    
        int nota,func,ruim=0,boa=0,otima=0,pess=0;
         
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("digita ai o numero de funcionário então");
        func = teclado.nextInt();
        
        
        for (int i=0;i < func;i++){
            System.out.println("digita tua nota ai funcionario " +(i+1));
            nota = teclado.nextInt();
            
            if ((nota >=0) && (nota <= 25)){
                pess++;
            }
            if ((nota > 25) && ( nota <=50 )){
                ruim++;
            }
            if ((nota >50 ) && (nota <=75 )){
                boa++;
            }
            if ((nota>75) && (nota<=100)){
                otima++;
            }
            if((nota < 0) || (nota>100)){
                System.out.println("bota nota direito");
                i--;
            }
        }
            System.out.println(" a porcentagem de pessimo e "+((pess*100)/func)+"% a porcentagem de ruim e "+((ruim*100)/func)+"% a porcentagem de boas e "+((boa*100)/func)+"% a porcentagem de otimas e "+ ((otima*100)/func)+"%");
    
    }
}
