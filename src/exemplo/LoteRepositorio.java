package exemplo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoteRepositorio {
    Map<String, Lote> lotes = new HashMap<>();
    public String addProduto(Lote lote) {
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }
    public Arrays getProdutos() {
        return (Arrays) Arrays.asList(lotes);
    }
    public Lote getProduto(String id) {
        return lotes.get(id);
    }
    public void updateProduto() {
        
    }
    public void deleteProduto(String id) {
        lotes.remove(id);
    }
}
