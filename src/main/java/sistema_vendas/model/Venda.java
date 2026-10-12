package sistema_vendas.model;

import java.util.List;

public class Venda {
    Cliente cliente;
    List<Produto> produtos;

    public Venda(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public double calcularTotal(){
        double valorCompra = 0;

        if (produtos.isEmpty()){
            System.out.println("Erro: carrinho está vazio!");
        }
        for (Produto produto : produtos){
            valorCompra += produto.preco;
        }
        return valorCompra;
    }

    public double aplicarDesconto(double desconto){
        double valorDoDesconto;
        double valorTotal = calcularTotal();
        double valorFinal = valorTotal;
        if (desconto < 0 || desconto > 100){
            System.out.println
                    ("Error desconto não pode ser maior que 100 ou menor que 0, ajuste o percentual do desconto");
        }else if (valorTotal >= 1000) {
            valorDoDesconto = valorTotal * (desconto / 100);
            valorFinal = valorTotal - valorDoDesconto;
        }
        return valorFinal;
    }

    public boolean validarVenda(){
        if (produtos.isEmpty() || cliente == null){
            System.out.println("Erro, não existe nada no carrinho ou não possue nenhum cliente verifique");
            return false;
        }
        return true;
    }

    public void exibirDados(){
        if (!validarVenda()){
            return;
        }
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Produtos comprados:");
        for (Produto produto : produtos){
            System.out.println(produto.getNome());
        }
        if (calcularTotal() < 1000){
            System.out.println("Valor total da compra é de: " + calcularTotal());
        }else {
            System.out.println("Valor final da compra: " + aplicarDesconto(10));
        }
    }
}
