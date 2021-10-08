package br.com.zup;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Digite 1 para cadastrar um vendedor");
        System.out.println("Digite 2 para cadastrar um cliente");
        System.out.println("Digite 3 para cadastrar uma venda");
        System.out.println("digite 4 para exibir a lista de vendedores");
        System.out.println("digite 5 para exibir a lista de clientes");
        System.out.println("digite 6 para exibir a lista de vendas");
        System.out.println("digite 7 para exibir a lista de vendas de um vendedor");
        System.out.println("digite 8 para exibir a lista de compras de um cliente");
        System.out.println("digite 9 para sair");
    }

    //cadastrar vendedor - método composto com a classe ServicoVendedor
    public static Vendedor cadastrarVendedor() throws Exception {
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String email = capturarDados("Digite o email do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o CPF do vendedor: ").nextLine();
        return ServicoVendedor.cadastrarVendedor(nome, email, cpf);
    }

    //cadastrar cliente - método composto com a classe ServicoCliente
    public static Cliente cadastrarCliente() throws Exception {
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, email, cpf);
    }

    //cadastrar venda - método composto com a classe ServicoVenda
    public static Venda cadastrarVenda() throws Exception {
        System.out.println("\n Registro de venda: ");
        String cpfCliente = capturarDados("Digite o CPF do cliente: ").nextLine();
        String emailVendedor = capturarDados("Digite o email do vendedor: ").nextLine();
        double valorAPagar = capturarDados("Digite o valor a ser pago: ").nextDouble();
        String dataRegistro = capturarDados("Digite a data de registro da venda: ").nextLine();
        return ServicoVenda.cadastrarVenda(cpfCliente, emailVendedor, valorAPagar, dataRegistro);
    }

    public static boolean executar() throws Exception {
        boolean seletor = true;
        List<Vendedor> vendedores = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();
        while (seletor) {
            menu();
            int opcaoUsuario = capturarDados("Digite a opção desejada").nextInt();
            if (opcaoUsuario == 1) {
                Vendedor vendedor = cadastrarVendedor();
                System.out.println(vendedor);
            } else if (opcaoUsuario == 2) {
                Cliente cliente = cadastrarCliente();
            } else if (opcaoUsuario == 3) {
                Venda venda = cadastrarVenda();
            } else if (opcaoUsuario == 4) {
                ServicoVendedor.exibirVendedores();
            } else if (opcaoUsuario == 5) {
                ServicoCliente.exibirClientes();
            } else if (opcaoUsuario == 6) {
                ServicoVenda.exibirVendas();
            } else if (opcaoUsuario == 7) {
                //mostrar vendas de um vendedor
                String email = capturarDados("Digite o email do vendedor: ").nextLine();
                List<Venda> vendasVendedor = ServicoVenda.vendasVendedor(email);
                System.out.println(vendasVendedor);
            } else if (opcaoUsuario == 8) {
                //mostrar compras de um cliente
                String cpf = capturarDados("Digite o CPF do cliente").nextLine();
                List<Venda> comprasCliente = ServicoVenda.comprasCliente(cpf);
                System.out.println(comprasCliente);
            } else if (opcaoUsuario == 9) {
                System.out.println("Finalizando programa de gestão de vendas");
                seletor = false;
            }
        }
        return seletor;
    }
}
