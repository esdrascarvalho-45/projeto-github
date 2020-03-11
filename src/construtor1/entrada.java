package construtor1;

import java.util.Scanner;

import entidade.produto;

public class entrada {

	public static void main(String[] args) {
		/*
		 * projeto basico de entrada de produto, quantidade e valor do produto, soma em
		 * estoque e soma de valores.
		 */
		Scanner scan = new Scanner(System.in);
		// Entrada de dados.
		System.out.println("Entre com o nome do produto:");
		String nome = scan.nextLine();

		System.out.println("Entre com o pre�o do produto:");
		double preco = scan.nextDouble();

		System.out.println("Entre com a quantidade:");
		int quantidade = scan.nextInt();
		// construtor
		produto produto = new produto(nome, preco, quantidade);
		// atualiza��o de estoque.
		System.out.println();
		System.out.println("Atualiza��o:" + produto);
		// adicionar ou n�o a quantidade do produto
		System.out.println();
		System.out.println("deseja adicionar a quantiade ?(s/n):");
		char escolha = scan.next().charAt(0);
		if (escolha == 's') {

			System.out.println();
			System.out.print("Entre com o Numero Para ser Adicionado no Estoque:");
			quantidade = scan.nextInt();
			produto.quantidadeEstoque(quantidade);
			// atualiza��o de estoque.
			System.out.println();
			System.out.println("atualiza��o produto:" + produto);

		}
		// remover ou n�o a quantidade do produto
		System.out.println("deseja remover quantidade produto ?(s/n):");
		char escolher = scan.next().charAt(0);
		if (escolher == 's') {
			System.out.println();
			System.out.println("Entre com o Numero Para Ser Removido do Estoque:");
			quantidade = scan.nextInt();
			produto.removeEstoque(quantidade);
			// atualiza��o de estoque.
			System.out.println();
			System.out.println("atualiza��o produto:" + produto);
		} 
		else {
			System.out.println();
			System.out.println("atualiza��o produto:" + produto);

		}

		scan.close();
	}

}
