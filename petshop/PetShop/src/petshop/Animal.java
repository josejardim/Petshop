package petshop;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private String dataNascimento;
    private String proprietario;

    public Animal(String nome, String especie, String raca, String dataNascimento, String proprietario) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = proprietario;
    }

    // Getters e setters
    // ...

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", proprietario='" + proprietario + '\'' +
                '}';
    }
}

