package br.es.exercicios.esb.exercicio11;

public class FornecedorMain {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Santa Joana Agua Mineral", 5000, 1000);
        System.out.println(fornecedor);

        if(fornecedor.obterSaldo() < 0){
            System.out.println("O fornecedor " + fornecedor.getNome() + " tem uma dívida de R$ " + (fornecedor.obterSaldo() * -1));
        }else if(fornecedor.obterSaldo() == 0){
            System.out.println("Estamos em dia com o forncedor " + fornecedor.getNome());
        }else {
            System.out.println("O fornecedor " + fornecedor.getNome() + " tem um credito de R$ " + fornecedor.obterSaldo());
        }
    }
}
