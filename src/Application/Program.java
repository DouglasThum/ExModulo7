package Application;

import java.util.Scanner;

import Entites.Produto;

public class Program {

	public static void main(String[] args) {
	
		Produto produto = new Produto();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Cadastrar novo produto: ");
		System.out.print("Insira o nome do produto: ");
		produto.setNome(input.nextLine());
		System.out.print("Insira o valor do produto: R$");
		produto.setValor(input.nextDouble());
		System.out.print("Insira a quantidade em estoque: ");
		produto.setQuantidade(input.nextInt());
		
		System.out.println("----------------------------------------");
		
		System.out.println("Produto cadastrado com sucesso!!!");
		produto.imprimirProduto();

		input.close();
	}
}
