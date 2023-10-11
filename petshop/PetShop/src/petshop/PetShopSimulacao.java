package petshop;

import java.util.ArrayList;

public class PetShopSimulacao {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Agenda> agendas = new ArrayList<>();

        // Exemplo de cadastro de animais
        Animal animal1 = new Animal("Rex", "Cachorro", "Labrador", "01/01/2018", "João");
        Animal animal2 = new Animal("Whiskers", "Gato", "Siamês", "15/05/2020", "Maria");
        animais.add(animal1);
        animais.add(animal2);

        // Exemplo de cadastro de produtos
        Produto produto1 = new Produto("Ração para Cachorro", "Alimento", 50.0, 100);
        Produto produto2 = new Produto("Brinquedo para Gato", "Brinquedo", 10.0, 30);
        produtos.add(produto1);
        produtos.add(produto2);

        // Exemplo de agendamento de serviço
        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Animal animalAgendado = animais.get(0);
        String dataAgendamento = "20/10/2023";
        String horarioAgendamento = "10:00";

        Agenda agenda1 = new Agenda(animalAgendado, banho, dataAgendamento, horarioAgendamento);
        Agenda agenda2 = new Agenda(animalAgendado, tosa, dataAgendamento, "11:00");

        agendas.add(agenda1);
        agendas.add(agenda2);

        // Exemplo de venda de produtos
        Produto produtoAVender = produtos.get(0);
        int quantidadeVendida = 5;

        if (produtoAVender.getQuantidadeEmEstoque() >= quantidadeVendida) {
            produtoAVender.vender(quantidadeVendida);
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Produto fora de estoque.");
        }

        // Exibir informações
        System.out.println("Lista de Animais:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }

        System.out.println("\nLista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("\nAgendamentos:");
        for (Agenda agenda : agendas) {
            System.out.println(agenda);
        }
    }
}

