package br.com.alura.springdata.service;

import java.util.Scanner;
import java.util.function.Consumer;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.orm.Cargo;
import br.com.alura.springdata.repository.CargoRepository;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

@Service
public class CrudCargoService {

	private final CargoRepository cargoRepository;
	private Boolean system = true;

	public CrudCargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public void inicial(Scanner scanner) {

		while (system) {
			System.out.println("Qual ação de cargo deseja executar");
			System.out.println("0 -> Sair");
			System.out.println("1 -> Salvar");
			System.out.println("2 -> Atualizar");
			System.out.println("3 -> Visualizar");
			System.out.println("4 -> Visualizar por id");
			System.out.println("5 -> Deletar");

			int action = scanner.nextInt();
			switch (action) {
			case 1:
				salvar(scanner);
				break;
			case 2:
				atualizar(scanner);
				break;
			case 3:
				visualizar();
				break;
			case 4:
				visualizarPorId(scanner);
				break;
			case 5:
				deletar(scanner);
				break;
			default:
				system = false;
				break;
			}

		}

	}

	private void salvar(Scanner scanner) {
		System.out.println("Descrição do cargo");
		String descricao = scanner.next();
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);

		cargoRepository.save(cargo);

		System.out.println("O cargo de " + cargo.getDescricao() + " Foi saldo com sucesso");

	}

	public void atualizar(Scanner scanner) {
		System.out.println("Id");
		int id = scanner.nextInt();
		System.out.println("Descrição do cargo");
		String descricao = scanner.next();

		Cargo cargo = new Cargo(id, descricao);

		cargoRepository.save(cargo);
	}

	private void visualizar() {
		Iterable<Cargo> cargos = cargoRepository.findAll();

		cargos.forEach(new Consumer<Cargo>() {

			@Override
			public void accept(Cargo cargo) {
				System.out.println(cargo);

			}

		});

	}

	private void visualizarPorId(Scanner scanner) {
//		Iterable<Cargo> cargos = cargoRepository.findAll();
		System.out.println("Qual o id");
		Integer id = scanner.nextInt();
		cargoRepository.findById(id);
		
		System.out.println("O usuário monstro informado é: " + id);
	}

	private void deletar(Scanner scanner) {
		System.out.println("Por favor informe o Id que quer excluir");
		Integer id = scanner.nextInt();
		cargoRepository.deleteById(id);
		
		System.out.println("O usuário de id "+ id + " deletado foi deletado com sucesso");

	}

}
