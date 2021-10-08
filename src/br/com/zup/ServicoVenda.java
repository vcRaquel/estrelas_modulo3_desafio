package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    //listar todas as vendas cadastradas - providenciar lista de vendas - serve também para cadastrar mais de uma venda no sistema
    private static List<Venda> vendas = new ArrayList<>();
    //não cadastrar vendas para clientes não cadastrados - providenciar lista de clientes - percorrer a lista comparando cpf ou email
    //não cadastrar vendas de vendedores não cadastrados - providenciar lista de vendedores - percorrer a lista comparando cpf ou email
    //cadastrar diversas vendas no sistema - método composto com a classe sistema para cadastrar uma venda, a lista se encarregará de garantir a multiplicidade de cadastro

}
