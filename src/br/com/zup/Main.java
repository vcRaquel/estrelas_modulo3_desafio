package br.com.zup;

public class Main {

    public static void main(String[] args) {
       try {
           System.out.println(Sistema.cadastrarVendedor());
           System.out.println(Sistema.cadastrarCliente());
           System.out.println(Sistema.cadastrarVenda());
       }catch (Exception erro){
           System.out.println(erro.getMessage());
       }

    }
}
