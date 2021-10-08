package br.com.zup;

public class Main {

    public static void main(String[] args) {
       try {
           System.out.println(Sistema.cadastrarVendedor());
           System.out.println(Sistema.cadastrarVendedor());
           ServicoVendedor.exibirVendedores();
           System.out.println(ServicoVendedor.buscarVendedorCadastrado("@"));
       }catch (Exception erro){
           System.out.println(erro.getMessage());
       }

    }
}
