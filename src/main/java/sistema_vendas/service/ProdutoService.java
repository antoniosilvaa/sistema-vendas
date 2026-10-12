package sistema_vendas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import sistema_vendas.model.Produto;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> listarProdutos(){
        return produtos;
    }


    public boolean adicionarProdutos(Produto produto){
        if (produto.getPreco() < 0){
            return false;
        }else {
            produtos.add(produto);
        }
        return true;
    }
}
