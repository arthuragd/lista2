package ex3;

import java.util.Calendar;

public class Funcionario {

	private String nome;
	private int ano;
	private double salario;
	private int idade;
	private double salarioLiq;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	private int calcularIdade() {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		return this.idade = anoAtual - this.ano;
	}
	
	private double calcularSalario() {
		return salarioLiq = (this.salario * 0.9 - 100);
	}
	
	public void infoFuncionario() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.calcularIdade());
		System.out.println("Salario: " + this.calcularSalario());
	}
}
