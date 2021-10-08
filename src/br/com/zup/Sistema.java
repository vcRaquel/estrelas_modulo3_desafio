package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //capturar dados
    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    //menu inicial
    public static void menu(){
        System.out.println("Programa de gerenciamento de vendas: \n");
        System.out.println("Digite 1 para cadastrar um funcionário");
        System.out.println("Digite 2 para cadastrar um cliente");
        System.out.println("Digite 3 para cadastrar uma venda");
        System.out.println("digite 4 para exibir a lista de funcionários");
        System.out.println("digite 5 para exibir a lista de clientes");
        System.out.println("digite 4 para exibir a lista de faturas");
        System.out.println("digite 7 para sair");
    }
    //cadastrar vendedor
    //cadastrar cliente
    //cadastrar venda
}
