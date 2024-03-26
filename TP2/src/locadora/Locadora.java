package locadora;

import veiculos.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> estoque;

    public Locadora() {
        estoque = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        estoque.add(veiculo);
    }

    public void imprimirEstoque() {
        for (Veiculo veiculo : estoque) {
            veiculo.imprimirDetalhes();
            System.out.println();
        }
    }
}