package Mercado;

import java.util.ArrayList;

public class ProdutoRepository {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public String listarProdutos(){
        return produtos.toString();
    }
}
