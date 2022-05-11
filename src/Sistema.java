import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepositorio;

public class Sistema {

	public static void main(String[] args) {
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepositorio catalogo = new ProdutoRepositorio();
		catalogo.addProduto(produto);
		catalogo.getProduto(produto.getId());
	}
}
