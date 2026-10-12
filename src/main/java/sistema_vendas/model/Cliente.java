package sistema_vendas.model;

public class Cliente {
    int id;
    String nome;
    String cpf;
    String telefone;

    public Cliente(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public void exibirDados(){
        System.out.println("ID Cliente: " + id + " nome cliente: " + nome + " CPF cliente: " + cpf + " telefone cliente: " + telefone);
    }

    public void atualizarTelefone(String novoNumero){
        if (novoNumero.length() != 11){
            System.out.println("Error ao tentar trocar o numero de Telefone, verifique se está correto");
        }else {
            telefone = novoNumero;
            exibirDados();
        }
    }

    public void validarCpf(){
        if (cpf.length() != 11 ){
            System.out.println("Error CPF com mais de 11 digitos");
        }
    }


}
