package sistema_vendas.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistema_vendas.model.Produto;
import sistema_vendas.service.ProdutoService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController {
    ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @PostMapping("/produtos")
    public ResponseEntity<?> adicionar(@RequestBody Produto produto){
        boolean sucesso = produtoService.adicionarProdutos(produto);
            if (sucesso){
                return ResponseEntity.status(201).body(produto);
            }else {
               return ResponseEntity.badRequest().body("Preço Invalido");
            }
    }

    @GetMapping("/produtos")
    public ResponseEntity<?> verificarPorId (int id){
        Produto produto = produtoService.buscaPorId(id);
        if (produto == null){
            return ResponseEntity.status(404).body("Valor Nulo, informe um id corretamente");
        }else{
            return ResponseEntity.status(200).body(produto);
        }
    }



    @GetMapping("/produtos")
    public List<Produto> listar(){
        List<Produto> produto;
        produto = produtoService.listarProdutos();
         return produto;
    }
}
