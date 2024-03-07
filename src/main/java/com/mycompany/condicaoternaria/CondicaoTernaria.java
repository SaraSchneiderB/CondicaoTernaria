package com.mycompany.condicaoternaria;

import java.util.Scanner;

public class CondicaoTernaria {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor");

        double preco = teclado.nextDouble();
        double desconto;

        //com if else
        
        /*if(preco < 20.0){
        desconto = preco * 0.1;
        }else{
        desconto = preco * 0.05;
        }
        System.out.printf("RS %.2f de desconto!", desconto);
         */
        
        
        
        //com Condição Ternária
        desconto = (preco < 20.0) ? (0.1) : (0.05);

        /*SE o preço for menor que 20 então será verdadeiro e imprimirá 0.1; 
        senão (caso seja maior que 20) será falso, logo imprimirá 0.05*/
        System.out.printf("RS %.2f de desconto!", desconto);

    }
}
