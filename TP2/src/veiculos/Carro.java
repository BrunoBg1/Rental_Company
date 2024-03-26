package veiculos;

public class Carro extends Veiculo {
    private String tipoTransmissao;
    private boolean temArCondicionado;

    public Carro(String marca, String modelo, int ano, double precoBaseAluguel, String tipoTransmissao, boolean temArCondicionado) {
        super(marca, modelo, ano, precoBaseAluguel);
        this.tipoTransmissao = tipoTransmissao;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public double calcularPrecoAluguel() {
        double preco = super.calcularPrecoAluguel();
        if (temArCondicionado) {
            preco += 50; // Adicional pelo ar-condicionado
        }
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Tipo de transmissão: " + tipoTransmissao);
        System.out.println("Tem ar-condicionado: " + (temArCondicionado ? "Sim \n Preço com ar-condicionado: " + (calcularPrecoAluguel()) : "Não"));
    }
}