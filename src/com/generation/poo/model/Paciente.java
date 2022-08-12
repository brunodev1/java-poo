package com.generation.poo.model;

public class Paciente {

	private String nome;
	private int idade;
	private String endereco;
	private int sus;
	private String motivo;
	private int contato;
	
	public Paciente(String nome, int idade, String endereco, int sus, String motivo, int contato) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.sus = sus;
		this.motivo = motivo;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getSus() {
		return sus;
	}

	public void setSus(int sus) {
		this.sus = sus;
	}
	
	public void getMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public void getContato(int contato) {
		this.contato = contato;
	}
	
	public void setContato(int contato) {
		this.contato = contato;
	}
	
	public void status() {
		System.out.println("Nome do paciente: "+ "\n"+this.nome);
		System.out.println();
		System.out.println("Idade do paciente: "+"\n"+this.idade);
		System.out.println();
		System.out.println("Endereço do paciente: "+"\n"+this.endereco);
		System.out.println();
		System.out.println("SUS do paciente: "+"\n"+this.sus);
		System.out.println();
		System.out.println("Contato do paciente: "+"\n"+this.contato);
		System.out.println();
		System.out.println("Queixas do paciente: "+"\n"+this.motivo);
		
		
	}
}
