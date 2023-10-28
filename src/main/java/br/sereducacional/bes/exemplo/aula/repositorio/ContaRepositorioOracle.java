package br.sereducacional.bes.exemplo.aula.repositorio;

import br.sereducacional.bes.exemplo.aula.entidades.Conta;

public class ContaRepositorioOracle implements IContaRepositorio{

    private static final Conta[] contas = new Conta[5];
    private int indice;

    public ContaRepositorioOracle(){
        indice = 0;
    }

    @Override
    public void salvar(Conta conta) {
        System.out.println("Estou usando a classe" + getClass().getName());

        contas[indice] = conta;
        indice++;
    }

    @Override
    public Conta buscar(int agencia, long numero) {
        System.out.println("Estou usando a classe" + getClass().getName());

        for (int i = 0; i < contas.length; i++) {
            if ((contas[i].getAgencia() == agencia) &&
                    (contas[i].getNumero() == numero)){
                return contas[i];
            }
        }
        return null;
    }

    @Override
    public Conta buscarManeiraModerna(int agencia, long numero) {
        return null;
    }
}
