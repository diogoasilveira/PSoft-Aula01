package Mercado;

import java.util.ArrayList;
import java.util.Date;

public class Facade {

    private ProdutoServices prodServices = new ProdutoServices();
    private LoteServices lotServices = new LoteServices();

    public void adicionarProduto(String nome, String fabricante, double preco){
        prodServices.criaProduto(nome, fabricante, preco);
    }

    public String listarProdutos(){
        return prodServices.listarProdutos();
    }

    public void adicionarLote(Produto prod, int qtd, Date dataFab){
        lotServices.criaLote(prod, qtd, dataFab);
    }

    public String listarLotes(){
        return lotServices.listarProdutos();
    }
}
