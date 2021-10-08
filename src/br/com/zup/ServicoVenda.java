package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //não cadastrar vendas para clientes não cadastrados - providenciar lista de clientes - percorrer a lista comparando cpf ou email
    //não cadastrar vendas de vendedores não cadastrados - providenciar lista de vendedores - percorrer a lista comparando cpf ou email
    //cadastrar diversas vendas no sistema - método composto com a classe sistema para cadastrar uma venda, a lista se encarregará de garantir a multiplicidade de cadastro
    public static Venda cadastrarVenda(String emailCliente, String emailVendedor, double valorAPagar, String dataRegistro) throws Exception {
        Cliente cliente = ServicoCliente.buscarClienteCadastrado(emailCliente);
        Vendedor vendedor = ServicoVendedor.buscarVendedorCadastrado(emailVendedor);

        Venda venda = new Venda(cliente, vendedor, valorAPagar, dataRegistro);
        vendas.add(venda);
        return venda;
    }

    //listar todas as vendas cadastradas - providenciar lista de vendas - serve também para cadastrar mais de uma venda no sistema
    //método temporário (?) para testes
    public static void exibirVendas() {
        System.out.println("\nLista de um total de " + vendas.size() + " vendas: ");
        for (Venda referencia : vendas) {
            System.out.println(referencia);
        }
    }
}
