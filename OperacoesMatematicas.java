/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Este projeto foi criado por Gustavo Ferroni Felipe
package com.mycompany.cauculadoradeareas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {
    public static void main(String[] args) {
        // Definiçao de dois números
        double num1 = 15.5;
        double num2 = 4.8;
        
        //Realizando operações matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; 
        double resto = num1 % num2;
        //Exibindo os resultados
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 !=0 ? divisao:
                "Indefinida (Divisao por zero)"));
        System.out.println("Resto da divisão " + resto );
// TODO code application login here
    }
    
}
;