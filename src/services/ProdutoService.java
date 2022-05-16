package services;

import java.util.ArrayList;

import exemplo.Lote;
import exemplo.LoteRepositorio;
import exemplo.Produto;
import exemplo.ProdutoRepositorio;

public class ProdutoService {
    LoteRepositorio loterepo;
    ProdutoRepositorio prodrepo;
    public ArrayList<Produto> prodbyLote(String nome){
        ArrayList<Lote> lotes = (ArrayList<Lote>) loterepo.getLotes();
        ArrayList<Produto> prods = getprodsfromLotes(lotes);
        ArrayList<Produto> prodsname = getProdyByName("leite", prods); 
        return prodsname;
    }
    public ArrayList<Produto> listarProdByName(String nome) {
        ArrayList<Produto> prods = (ArrayList<Produto>) prodrepo.getProdutos();
        ArrayList<Produto> prodsname = getProdyByName("leite", prods); 
        return prodsname;
    }
    public ArrayList<Produto> getprodsfromLotes(ArrayList<Lote> lotes){
        ArrayList<Produto> prods = new ArrayList<Produto>();
        for (int i = 0; i < lotes.size(); i++) {
            prods.add(lotes.get(i).getProduto());
        }
        
        return prods;
    }
    private ArrayList<Produto> getProdyByName(String name,ArrayList<Produto> prods ) {
        ArrayList<Produto> produtosNomes = new ArrayList<Produto>();
        for (int i = 0; i < prods.size(); i++) {
            if(prods.get(i).getNome().contains(name)){
                produtosNomes.add(prods.get(i));
            }
        }
        return produtosNomes;
    }

}
