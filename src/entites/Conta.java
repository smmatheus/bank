package entites;

public class Conta {
	private int num;
	private String nome;
	private double valor;
	
	public Conta(int num, String nome) {
		this.num = num;
		this.nome = nome;
	}
	
	public Conta(int num, String nome, double depI) {
		this.num = num;
		this.nome = nome;
		deposito(depI);
	}


	public int getNum() {
		return num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	
	public void deposito(double valor) {
		this.valor += valor;
	}
	
	public void saque(double valor) {
		this.valor -= valor + 5.00;
	}
	
	public String toString() {
		return "Conta"
				+ num
				+ ", Nome: "
				+ nome 
				+ ", Valor: R$ "
				+ String.format("%.2f", valor);
	}
	
}
