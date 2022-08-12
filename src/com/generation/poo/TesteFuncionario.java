package com.generation.poo;

import com.generation.poo.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("João",892,8,19,"Desenvolvedor",5000.00f);

		funcionario.status();
	}

}
