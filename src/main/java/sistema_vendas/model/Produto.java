package sistema_vendas.model;

public class Produto {
    int id;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Numero ID: " + id + " Nome do Produto: " + nome + " o valor é: " + preco);
    }

    public void alterarPreco(double novoPreco){

        if (novoPreco < 0){
            System.out.println("Error valor menor que 0");
        }else {
            preco = novoPreco;
        }
    }

    public void aplicarDesconto(double desconto){
        double valorDoDesconto = preco * (desconto / 100);
        double valorFinal = preco - valorDoDesconto;
        preco = valorFinal;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
