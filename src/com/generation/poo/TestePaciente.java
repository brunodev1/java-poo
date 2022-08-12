package com.generation.poo;

import com.generation.poo.model.Paciente;

public class TestePaciente {

	public static void main(String[] args) {
		
		Paciente pacienteUm = new Paciente("Bruno",12,"Rua fictícia",805315135,"Febre",22223333);
		
		pacienteUm.status();		
	
	}

}
