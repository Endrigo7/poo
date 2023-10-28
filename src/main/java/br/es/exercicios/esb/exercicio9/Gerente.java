package br.es.exercicios.esb.exercicio9;

public class Gerente extends Empregado{

    private String departamento;

    public Gerente(String nome, String departamento, float salario){
        super(nome);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String toString(){
        return "Gerente : " + getNome() + "\n"
                + ", departamento: " + departamento + "\n"
                + ", salario     : " + salario;
    }

}
