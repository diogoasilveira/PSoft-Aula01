package Mercado;

import java.util.Date;

public class Lote {
    private Produto prod;
    private int qtd;
    private Date dataFab;

    public Lote(Produto prod, int qtd, Date dataFab){
        this.prod = prod;
        this.qtd = qtd;
        this.dataFab = dataFab;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Date getDataFabo() {
        return dataFab;
    }

    public void setDataFab(Date dataFab) {
        this.dataFab = dataFab;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "Produto = " + prod.getNome() +
                ", Quantidade = " + qtd +
                ", Data de Fabricação = " + dataFab +
                '}';
    }
}
