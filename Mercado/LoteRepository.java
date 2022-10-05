package Mercado;

import java.util.ArrayList;

public class LoteRepository {
    private ArrayList<Lote> lotes = new ArrayList<Lote>();

    public void adicionarLote(Lote lote){
        lotes.add(lote);
    }

    public String listarProdutos(){
        return lotes.toString();
    }
}
