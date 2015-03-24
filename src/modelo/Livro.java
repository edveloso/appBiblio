package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


// vem do pacote javax.persistence
@Entity
public class Livro {

	@Id @GeneratedValue
	private Integer codigo;
	
	//criem gets e sets
	private String nome;
	
	private String autor;

	public Livro(){
	}
	
	public Livro(String nome, String autor){
		this.nome = nome;
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	
}
