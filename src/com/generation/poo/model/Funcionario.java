package com.generation.poo.model;

public class Funcionario {

	private String nome;
	private int id;
	private int horarioEntrada;
	private int horarioSaida;
	private String funcao;
	private float salario;
	
	public Funcionario(String nome, int id, int horarioEntrada, int horarioSaida, String funcao, float salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.funcao = funcao;
		this.salario = salario;
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

	public void setId(int id) {
		this.id = id;
	}

	public int getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(int horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public int getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(int horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void status() {
		System.out.println("Nome do funcionario: "+this.nome);
		System.out.println();
		System.out.println("Número de identificação:: "+this.id);
		System.out.println();
		System.out.println("Horario de entrada do funcionário: "+this.horarioEntrada);
		System.out.println();
		System.out.println("Horario de saída do funcionário: "+this.horarioSaida);
		System.out.println();
		System.out.println("Cargo do funcionário: "+this.funcao);
		System.out.println();
		System.out.println("Salário do funcionário: "+this.salario);
		
	}
}
