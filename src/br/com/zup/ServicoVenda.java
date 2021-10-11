package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //getter
    public static List<Venda> getVendas() {
        return vendas;
    }

    //cadastrar diversas vendas no sistema - método composto com a classe sistema para cadastrar uma venda, a lista se encarregará de garantir a multiplicidade de cadastro
    public static Venda cadastrarVenda(String cpfCliente, String emailVendedor, double valorAPagar, String dataRegistro) throws Exception {
        Cliente cliente = ServicoCliente.buscarClienteCadastrado(cpfCliente);
        Vendedor vendedor = ServicoVendedor.buscarVendedorCadastrado(emailVendedor);

        Venda venda = new Venda(cliente, vendedor, valorAPagar, dataRegistro);
        vendas.add(venda);
        return venda;
    }

    //listar todas as vendas cadastradas
    public static void exibirVendas() {
        System.out.println("\nLista de um total de " + vendas.size() + " vendas: ");
        for (Venda referencia : vendas) {
            System.out.println(referencia);
        }
    }

    //listar todas compras de um cliente pelo seu cpf
    public static List<Venda> comprasCliente(String cpfCliente) {
        String cpfTratado = ValidaDado.tratarCpf(cpfCliente);
        List<Venda> comprasCliente = new ArrayList<>();

        for (Venda referencia : vendas) {
            if (referencia.getCliente().getCpf().equals(cpfTratado)) {
                comprasCliente.add(referencia);
            }
        }
        return comprasCliente;

    }

    //listar todas as vendas de um vendedor pelo seu e-mail
    public static List<Venda> vendasVendedor(String email) {
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda referencia : vendas) {
            if (referencia.getVendedor().getEmail().equals(email)) {
                vendasVendedor.add(referencia);
            }
        }
        return vendasVendedor;
    }


}
