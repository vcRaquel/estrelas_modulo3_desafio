package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
//           System.out.println(ValidaDado.tratarCpf("36854+ - 8567"));
            System.out.println(Sistema.cadastrarVendedor());
            System.out.println(Sistema.cadastrarCliente());
            System.out.println(Sistema.cadastrarVenda());
            System.out.println(Sistema.cadastrarVenda());
            System.out.println(ServicoVenda.comprasCliente("1"));

//           System.out.println(Sistema.cadastrarVenda());
//           System.out.println("==========================");
//           ServicoVenda.exibirVendas();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

    }
}
