package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double precoBaseAluguel, int cilindradas) {
        super(marca, modelo, ano, precoBaseAluguel);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularPrecoAluguel() {
        double preco = super.calcularPrecoAluguel();
        if (cilindradas > 500) {
            preco += 30; // Adicional para motos com mais de 500cc
        }
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Preço com adicional de cilindradas: " + (cilindradas > 500 ? calcularPrecoAluguel() + 30 : "Não"));
    }
}