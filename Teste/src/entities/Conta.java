package entities;

public class Conta {
	String nome ;
	double saldo;	
	
	public Conta (String nome, double saldo) {
		
		this.nome = nome;
		this.saldo = saldo;
		}
	
	public Conta(String nome) {	
		this.nome = nome;	
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void saque (double saque){
		saldo =saldo - saque -5 ;
		System.out.println("Sacou : " + saque);
		System.out.println("O seu saldo agora é :" + saldo);
	}
	
	public void deposito (double dep){
		saldo =saldo + dep;
		
		
	}
	
	
	
}
