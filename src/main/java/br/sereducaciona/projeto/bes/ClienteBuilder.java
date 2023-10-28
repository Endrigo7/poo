package br.sereducaciona.projeto.bes;

public class ClienteBuilder {


    public Cliente newCliente(String nome, String cpf){
        Cliente cliente = new Cliente();
        cliente.nome = nome;
        cliente.cpf = cpf;
        return cliente;
    }

}
