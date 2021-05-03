package br.com.alura.springdata.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.repository.UnidadeFuncional;

@Service
public class CrudUnidadeFuncionalService {

	private final UnidadeFuncional unidadeFuncional;

	public CrudUnidadeFuncionalService(UnidadeFuncional unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
	private void inicial(Scanner scanner) {
		
	}
	
	private void salvar(Scanner scanner) {
		System.out.println("Salvando arquivo em Unidade Funcional");
		System.out.println("Informe a unidade de trabalho");
		String descricao = scanner.next();
		System.out.println("");
	}
	
	
}
