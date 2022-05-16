package exemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LoteRepositorio {
    Map<String, Lote> lotes = new HashMap<>();
    public String addProduto(Lote lote) {
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }
    public Collection<Lote> getLotes() {
        return lotes.values();
    }
    public Lote getLotes(String id) {
        return lotes.get(id);
    }
    
    public void updateProduto() {
                
    }
    public void deleteProduto(String id) {
        lotes.remove(id);
    }
}
