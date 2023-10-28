package br.sereducacional.bes.exemplo.aula.repositorio;

import br.sereducacional.bes.exemplo.aula.entidades.Conta;

public interface IContaRepositorio {

    void salvar(Conta conta);

    Conta buscar(int agencia, long numero);

    Conta buscarManeiraModerna(int agencia, long numero);
}
