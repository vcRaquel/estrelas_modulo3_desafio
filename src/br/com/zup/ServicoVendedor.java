package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();
    //listar todos vendedores - lista de vendedores - fazer exibição percorrendo a lista e printando a referencia

    //cadastrar vendedor - método composto com a classe sistema para cadastrar um vendedor - a lista garantirá a multiplicidade de cadastros
    public static Vendedor cadastrarVendedor(String nome, String email, String cpf){
        Vendedor vendedor = new Vendedor(nome, email, cpf);
        vendedores.add(vendedor);
        return vendedor;
    }
    //verificar se o vendedor está cadastrado - percorrer a lista de vendedores comparando cpf ou email;
}
