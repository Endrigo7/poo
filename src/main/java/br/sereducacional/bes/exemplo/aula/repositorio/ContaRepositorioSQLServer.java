package br.sereducacional.bes.exemplo.aula.repositorio;

import br.sereducacional.bes.exemplo.aula.entidades.Conta;

import java.util.ArrayList;

public class ContaRepositorioSQLServer implements IContaRepositorio {

    private ArrayList<Conta> contas = new ArrayList<>();

    public void salvar(Conta conta){
        System.out.println("Estou usando a classe" + getClass().getName());
        contas.add(conta);
    }
    
    public Conta buscar(int agencia, long numero){
        System.out.println("Estou usando a classe" + getClass().getName());

        for (int i = 0; i < contas.size(); i++){
            Conta conta = contas.get(i);

            if ((conta.getAgencia() == agencia) &&
                    (conta.getNumero() == numero)){
                return conta;
            }
        }
        return null;
    }

    public Conta buscarManeiraModerna(int agencia, long numero){
        return contas
                .stream()
                .filter(conta -> (conta.getAgencia() == agencia) &&
                                 (conta.getNumero() == numero)).findFirst().get();
    }

}
