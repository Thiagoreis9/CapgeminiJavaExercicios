package atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1;
        int n2;
        int soma;
        
        System.out.println("Atividade 01 :");
        System.out.println("Insira o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        n2 = sc.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("Soma: " + soma);
        
        sc.close();
        
    }
}
