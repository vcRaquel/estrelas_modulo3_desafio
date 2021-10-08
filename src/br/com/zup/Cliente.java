package br.com.zup;

public class Cliente extends Pessoa{

    public Cliente() {
    }

    public Cliente(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome do cliente: " + super.getNome());
        retorno.append("\n Email do cliente: " + super.getEmail());
        retorno.append("\n CPF do cliente: " + super.getCpf());
        return retorno.toString();
    }
}
