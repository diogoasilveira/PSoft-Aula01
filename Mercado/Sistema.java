package Mercado;

public class Sistema {
    public static void main(String[] args) {
        Produto bike = new Produto("Bicicleta", "Caloi", 450.00);
        System.out.println("Produto: " + bike.getNome());
        System.out.println("Fabricante: " + bike.getFabricante());
        System.out.println("Preco: " + bike.getPreco());
    }
}
