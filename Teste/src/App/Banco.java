package App;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome :");
		String nome = sc.nextLine();		
		System.out.print("Qual o valor do deposito inicial : ");
		double vl = sc.nextDouble();
	
		Conta c = new Conta (nome, vl );
	
		
		System.out.println(c.getNome());
		System.out.println(c.getSaldo());
		
		
		sc.close();
		
		
		
	}
}
