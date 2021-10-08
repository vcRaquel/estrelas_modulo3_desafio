package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    //verificar se o cliente está cadastrado por cpf- percorrer a lista de vendedores comparando cpf desconsiderando espaço;
    public static boolean verificarCadastroCpfCliente(String cpf) {
        String cpfTratado = ValidaDado.tratarCpf(cpf);
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpfTratado)) {
                return true;
            }
        }
        return false;
    }

    //verificar se o cliente está cadastrado por email- percorrer a lista de vendedores comparando email;
    public static boolean verificaCadastroEmailCliente(String email) {
        for (Cliente referencia : clientes) {
            if (referencia.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    //cadastrar cliente - método composto com a classe sistema para cadastrar um cliente - a lista garantirá a multiplicidade de cadastros
    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception {
        ValidaDado.validarEmail(email);
        String cpfTratado = ValidaDado.tratarCpf(cpf);
        boolean cpfCadastrado = verificarCadastroCpfCliente(cpfTratado);
        boolean emailCadastrado = verificaCadastroEmailCliente(email);
        if (!cpfCadastrado && !emailCadastrado) {
            Cliente cliente = new Cliente(nome, email, cpf);
            clientes.add(cliente);
            return cliente;
        } else if (cpfCadastrado && emailCadastrado) {
            throw new Exception("CPF e email já constam no cadastro de clientes");
        } else if (cpfCadastrado) {
            throw new Exception("CPF já consta no cadastro de clientes");
        } else if (emailCadastrado) {
            throw new Exception("email já consta no cadastro de clientes");
        }
        throw new Exception("Não foi possível concluir o cadastro de cliente");//verificar se é necessária
    }

    //listar todos clientes - lista de clientes - fazer exibição percorrendo a lista e printando a referencia
    //método temporário (?) para testes
    public static void exibirClientes() {
        System.out.println("\nLista de um total de " + clientes.size() + " clientes: ");
        for (Cliente referencia : clientes) {
            System.out.println(referencia);
        }
    }

    //retornar um cliente que está cadastrado por CPF - percorrer a lista de clientes comparando CPF;
    public static Cliente buscarClienteCadastrado(String cpf) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)) {
                return referencia;
            }
        }
        throw new Exception("\n Cliente não cadastrado");
    }


}
