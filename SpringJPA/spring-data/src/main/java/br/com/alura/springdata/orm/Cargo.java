package br.com.alura.springdata.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionario;

	public Cargo() {

	}

	public Cargo(String descricao) {
		this.descricao = descricao;
	}

	public Cargo(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	@Override
	public String toString() {
		return " id -> " + id + ", descricao=" + descricao;
	}

}
