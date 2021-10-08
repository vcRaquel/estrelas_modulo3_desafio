package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    //cadastrar cliente - método composto com a classe sistema para cadastrar um cliente - a lista garantirá a multiplicidade de cadastros
    public static Cliente cadastrarCliente(String nome, String email, String cpf){
        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }

    //listar todos clientes - lista de clientes - fazer exibição percorrendo a lista e printando a referencia
    //método temporário (?) para testes
    public static void exibirClientes() {
        System.out.println("\nLista de um total de " +clientes.size() +  " clientes: ");
        for (Cliente referencia : clientes) {
            System.out.println(referencia);
        }
    }
    //verificar se o cliente está cadastrado - percorrer a lista de vendedores comparando cpf ou email;
    public static Cliente buscarClienteCadastrado(String email)throws Exception{
        for (Cliente referencia: clientes){
            if (referencia.getEmail().equals(email)){
                return referencia;
            }
        }
        throw new Exception("\n Cliente não cadastrado");
    }
}
