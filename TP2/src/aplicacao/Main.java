package aplicacao;

import locadora.Locadora;
import veiculos.Carro;
import veiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();
        locadora.adicionarVeiculo(new Carro("BMW", "X6", 2024, 10000, "Automática", false));
        locadora.adicionarVeiculo(new Moto("Honda", "CB300F", 2024, 50, 294));

        locadora.imprimirEstoque();
    }
}