package br.sereducacional.bes.exemplo.aula.repositorio;

import br.sereducacional.bes.exemplo.aula.entidades.Conta;

public class ContaRepositorioMySQL implements IContaRepositorio{
    @Override
    public void salvar(Conta conta) {

    }

    @Override
    public Conta buscar(int agencia, long numero) {
        return null;
    }

    @Override
    public Conta buscarManeiraModerna(int agencia, long numero) {
        return null;
    }
}
