package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precoBaseAluguel;

    public Veiculo(String marca, String modelo, int ano, double precoBaseAluguel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoBaseAluguel = precoBaseAluguel;
    }

    public double calcularPrecoAluguel() {
        return precoBaseAluguel;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço base de aluguel: " + precoBaseAluguel);
    }
}