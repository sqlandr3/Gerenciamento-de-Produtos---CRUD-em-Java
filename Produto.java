package Produto;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: R$" + preco;
    }
}

//Criamos a classe Produto para representar cada produto, com id, nome e preço, métodos para acessar/alterar os dados e toString() para mostrar no console.
// No Main.java iniciamos o programa com main,
// criamos um ArrayList para guardar produtos na memória e um Scanner para ler entradas do usuário,
// preparando o menu CRUD.