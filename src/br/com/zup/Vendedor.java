package br.com.zup;

public class Vendedor extends Pessoa{
    public Vendedor() {
    }

    public Vendedor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome do vendedor: " + super.getNome());
        retorno.append("\n Email do vendedor: " + super.getEmail());
        retorno.append("\n CPF do vendedor: " + super.getCpf() + "\n");
        return retorno.toString();
    }
}
