package Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;

        do {

            System.out.println("\n<Sistema de Produtos>");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar todos os produtos");
            System.out.println("4 - Atualizar produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    Produto novoProduto = new Produto(id, nome, preco);
                    produtos.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                }
                case 2: {
                    System.out.print("Digite o ID do produto que deseja remover: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getId() == idRemover) {
                            produtos.remove(i);
                            System.out.println("Produto removido com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                }
                case 3: {
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.println("=== Lista de Produtos ===");
                        for (Produto produto : produtos) {
                            System.out.println(produto);
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Digite o ID do produto que deseja atualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontrado = false;
                    for (Produto produto : produtos) {
                        if (produto.getId() == id) {
                            System.out.print("Digite o novo nome do produto: ");
                            String novoNome = scanner.nextLine();
                            produto.setNome(novoNome);

                            System.out.print("Digite o novo preço do produto: ");
                            double novoPreco = scanner.nextDouble();
                            produto.setPreco(novoPreco);

                            System.out.println("Produto atualizado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                }
                case 0: // Sair
                    System.out.println("Saindo...");
                    break;
                default: // Opção inválida
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
