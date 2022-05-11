package exemplo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepositorio{
     Map<String, Produto> produtos = new HashMap<>();
    public String addProduto(Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto.getId();
    }
    public Arrays getProdutos() {
        return (Arrays) Arrays.asList(produtos);
    }
    public Produto getProduto(String id) {
        return produtos.get(id);
    }
    public void updateProduto() {
        
    }
    public void deleteProduto(String id) {
        produtos.remove(id);
    }
    

}