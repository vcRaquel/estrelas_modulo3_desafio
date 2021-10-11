package br.com.zup;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valorASerPago;
    private String dataRegistro;

    //construtores
    public Venda() {

    }
    public Venda(Cliente cliente, Vendedor vendedor, double valorASerPago, String dataRegistro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorASerPago = valorASerPago;
        this.dataRegistro = dataRegistro;
    }

    //getters e setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    //toString

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Descritivo de venda: ");
        retorno.append("\n Nome do cliente: " + cliente.getNome());
        retorno.append("\n Nome do vendedor responsável: " + vendedor.getNome());
        retorno.append("\n Valor a ser pago: " + valorASerPago);
        retorno.append("\n Data de registro da venda: " + dataRegistro + "\n");
        return retorno.toString();
    }
}
