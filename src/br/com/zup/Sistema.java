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
    //cadastrar vendedor - método composto com a classe ServicoVendedor
    public static Vendedor cadastrarVendedor(){
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String email = capturarDados("Digite o email do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o CPF do vendedor: ").nextLine();
        return ServicoVendedor.cadastrarVendedor(nome, email, cpf);
    }
    //cadastrar cliente - método composto com a classe ServicoCliente
    //cadastrar venda - método composto com a classe ServicoVenda
}