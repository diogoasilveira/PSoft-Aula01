package Mercado;

import java.util.Date;

public class LoteServices {
    LoteRepository repository = new LoteRepository();

    public void criaLote(Produto prod, int qtd, Date dataFab){
        Lote newLote = new Lote(prod, qtd, dataFab);
        repository.adicionarLote(newLote);
    }

    public String listarProdutos(){
        return repository.listarProdutos();
    }
}
