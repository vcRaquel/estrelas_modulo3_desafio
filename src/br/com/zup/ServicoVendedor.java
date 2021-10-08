package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();


    //cadastrar vendedor - método composto com a classe sistema para cadastrar um vendedor - a lista garantirá a multiplicidade de cadastros
    public static Vendedor cadastrarVendedor(String nome, String email, String cpf) {
        Vendedor vendedor = new Vendedor(nome, email, cpf);
        vendedores.add(vendedor);
        return vendedor;
    }

    //listar todos vendedores - lista de vendedores - fazer exibição percorrendo a lista e printando a referencia
    //método temporário (?) para testes
    public static void exibirVendedores() {
        System.out.println("\nLista de um total de " +vendedores.size() +  " vendedores: ");
        for (Vendedor referencia : vendedores) {
            System.out.println(referencia);
        }
    }
    //verificar se o vendedor está cadastrado - percorrer a lista de vendedores comparando cpf ou email;
}
