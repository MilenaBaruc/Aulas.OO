package aula4;

public class Carro {
	
	String marca;
	String cor;
	int numPortas;
	int ano;
	boolean movimento;
	
	public Carro(String marca, String cor, int n, int a, boolean mov) {
		
		this.marca = marca;
		this.cor = cor;
		numPortas = n;
		ano = a;
		movimento = mov;
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca() {
		this.marca = marca;
	}
	
	public void getAno(int ano) {
		this.ano = ano;
	}
	
	public void movimentar() {
		movimento = true;
	}
	
	public void parar() {
		movimento = false;
	}
}
