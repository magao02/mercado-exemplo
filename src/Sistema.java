import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepositorio;

public class Sistema {

	public static void main(String[] args) {
		Produto produto = new Produto("leite", "Parmalat");
		Produto produto2 = new Produto("leite em pó", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepositorio catalogo = new ProdutoRepositorio();
		catalogo.addProduto(produto);
		catalogo.addProduto(produto2);
		catalogo.getProduto(produto.getId());
		catalogo.getProdutoByName("leite");
	}
}
