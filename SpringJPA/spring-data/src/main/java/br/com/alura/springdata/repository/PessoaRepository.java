package br.com.alura.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.orm.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{
	

}
