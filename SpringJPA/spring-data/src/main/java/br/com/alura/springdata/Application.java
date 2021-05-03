package br.com.alura.springdata;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.service.CrudCargoService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private Boolean system = true;
	private final CrudCargoService cargoService;
//	private final PessoaRepository prepository;

		
	public Application(CrudCargoService cargoService) {
		this.cargoService = cargoService;
//		this.prepository = pessoaRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		

		while (system) {
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 -- Sair");
			System.out.println("1 -- Cargo");
			int action = scanner.nextInt();

			if (action == 1) {
				cargoService.inicial(scanner);
			} else {
				system = false;
			}
//			scanner.close();

		}

		/*
		 * List<Pessoa> p = new ArrayList<>(); p.add(new Pessoa("Sérgio Silva"));
		 * p.add(new Pessoa("Darkson Silva")); p.add(new Pessoa("Dadimar Laurindo"));
		 * p.add(new Pessoa("Severiano Leandro"));
		 * 
		 * p.forEach(pessoas ->{ prepository.save(pessoas); });
		 * 
		 * // Pessoa pessoa = new Pessoa(); // pessoa.setNome("Sílvio Silva");
		 * 
		 * // repository.save(cargo); // prepository.save(pessoa);
		 */
	}

}
