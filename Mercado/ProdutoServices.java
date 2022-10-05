package Mercado;

public class ProdutoServices {

    ProdutoRepository repository = new ProdutoRepository();

    public void criaProduto(String nome, String fabricante, double preco){
        Produto newProduto = new Produto(nome, fabricante, preco);
        repository.adicionarProduto(newProduto);
    }

    public String listarProdutos(){
        return repository.listarProdutos();
    }

}
