package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
public class ProdutoRepositorio{
     Map<String, Produto> produtos = new HashMap<>();
    public String addProduto(Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto.getId();
    }
    public Collection<Produto> getProdutos() {
        return produtos.values();
    }
    public Produto getProduto(String id) {
        return produtos.get(id);
    }
    public ArrayList<Produto> getProdutoByName(String nome){
        ArrayList<Produto> produtosNomes = new ArrayList<Produto>();
        for(Produto produto : produtos.values()){
            if (produto.getNome().contains(nome)) {
                produtosNomes.add(produto);
            }
        }
        return produtosNomes;
    }
    public void updateProduto() {
        
    }
    public void deleteProduto(String id) {
        produtos.remove(id);
    }
    

}