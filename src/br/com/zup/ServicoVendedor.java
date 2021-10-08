package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();
////verificar se o vendedor está cadastrado por cpf - percorrer a lista de vendedores comparando cpf desconsiderando espaço;

    public static boolean verificarCadastroCpfVendedor(String cpf) {
        String cpfTratado = ValidaDado.tratarCpf(cpf);
        for (Vendedor referencia : vendedores) {
            if (referencia.getCpf().equals(cpfTratado)) {
                return true;
            }
        }
        return false;
    }

    //    //verificar se o cliente está cadastrado por email- percorrer a lista de vendedores comparando email;
    public static boolean verificaCadastroEmailVendedor(String email) {
        for (Vendedor referencia : vendedores) {
            if (referencia.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    //cadastrar vendedor - método composto com a classe sistema para cadastrar um vendedor - a lista garantirá a multiplicidade de cadastros
    public static Vendedor cadastrarVendedor(String nome, String email, String cpf) throws Exception {
        ValidaDado.validarEmail(email);
        String cpfTratado = ValidaDado.tratarCpf(cpf);

        boolean cpfCadastrado = verificarCadastroCpfVendedor(cpfTratado);
        boolean emailCadastrado = verificaCadastroEmailVendedor(email);

        if (!cpfCadastrado && !emailCadastrado) {
            Vendedor vendedor = new Vendedor(nome, email, cpf);
            vendedores.add(vendedor);
            return vendedor;
        } else if (cpfCadastrado && emailCadastrado) {
            throw new Exception("CPF e email já constam no cadastro de vendedores");
        } else if (cpfCadastrado) {
            throw new Exception("CPF já consta no cadastro de vendedores");
        } else if (emailCadastrado) {
            throw new Exception("email já consta no cadastro de vendedores");
        }
        throw new Exception("Não foi possível concluir o cadastro de vendedor");//verificar se é necessária

    }


    //listar todos vendedores - lista de vendedores - fazer exibição percorrendo a lista e printando a referencia
    //método temporário (?) para testes
    public static void exibirVendedores() {
        System.out.println("\nLista de um total de " + vendedores.size() + " vendedores: ");
        for (Vendedor referencia : vendedores) {
            System.out.println(referencia);
        }
    }

    //buscar vendedor por email
    public static Vendedor buscarVendedorCadastrado(String email) throws Exception {
        for (Vendedor referencia : vendedores) {
            if (referencia.getEmail().equals(email)) {
                return referencia;
            }
        }
        throw new Exception("\n Vendedor não cadastrado");
    }
}
