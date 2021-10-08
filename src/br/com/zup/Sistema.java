package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //capturar dados
    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //menu inicial
    public static void menu() {
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
    public static Vendedor cadastrarVendedor() throws Exception{
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String email = capturarDados("Digite o email do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o CPF do vendedor: ").nextLine();
        return ServicoVendedor.cadastrarVendedor(nome, email, cpf);
    }

    //cadastrar cliente - método composto com a classe ServicoCliente
    public static Cliente cadastrarCliente() throws Exception{
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, email, cpf);
    }

    //cadastrar venda - método composto com a classe ServicoVenda
    public static Venda cadastrarVenda() throws Exception{
        System.out.println("\n Registro de venda: ");
        String emailCliente = capturarDados("Digite o email do cliente: ").nextLine();
        String emailVendedor = capturarDados("Digite o email do vendedor: ").nextLine();
        double valorAPagar = capturarDados("Digite o valor a ser pago: ").nextDouble();
        String dataRegistro = capturarDados("Digite a data de registro da venda: ").nextLine();
        return ServicoVenda.cadastrarVenda(emailCliente, emailVendedor, valorAPagar, dataRegistro);
    }
}
