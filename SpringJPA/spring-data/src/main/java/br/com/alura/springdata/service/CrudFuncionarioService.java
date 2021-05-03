package br.com.alura.springdata.service;

import java.util.Date;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.orm.Funcionario;
import br.com.alura.springdata.repository.FuncionarioRepository;

@Service
public class CrudFuncionarioService {
	private final FuncionarioRepository funcRepository;

	public CrudFuncionarioService(FuncionarioRepository funcRepository) {
		this.funcRepository = funcRepository;
	}

	private void inicial(Scanner scanner) {
		salvar(scanner);
	}

	private void salvar(Scanner scanner) {
		System.out.println("Nome: ");
		String nome = scanner.next();
		System.out.println("Cpf: ");
		Integer cpf = scanner.nextInt();
		System.out.println("Salário: ");
		Double salario = scanner.nextDouble();
		// System.out.println();
		Date dataCadastro = new Date();

//		Funcionario func = new Funcionario(nome, cpf, salario, dataCadastro);

//		funcRepository.save(func);

	}

}
