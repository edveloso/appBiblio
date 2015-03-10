package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Livro;


@ManagedBean(name="livroMB")
@RequestScoped
public class LivroMB {

	//dados da tela
	private Livro livro = new Livro();
	//private LivroDAO dao = new LivroDAO();
	private List<Livro> livros;
	
	private List<String> editoras;
	private String tipoLivroSelecionado;
	private String editoraSelecionada;
	private String comentario;
	
	//é uma convenção inicializar valores no 
	//construtor
	public LivroMB() {
		editoras = new ArrayList<String>();
		editoras.add("Abril");
		editoras.add("Saraiva");
		editoras.add("Arqueiro");
		editoras.add("Pearson");
		editoras.add("O'reilly");
		
		livros = new ArrayList<Livro>();
		livros.add(new Livro("Php", "Joao"));
		livros.add(new Livro("Java", "Veloso"));
		livros.add(new Livro("Algoritmo", "Flavio"));
		
	}
	
	
	//acoes do caso de uso
	public String cadastrar(){
		//fazer o dao chamar salvar livro
		//dao.salvar(livro);
		return "listar";
	}
	
	//gets e sets
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public List<String> getEditoras() {
		return editoras;
	}


	public void setEditoras(List<String> editoras) {
		this.editoras = editoras;
	}


	public String getTipoLivroSelecionado() {
		return tipoLivroSelecionado;
	}


	public void setTipoLivroSelecionado(String tipoLivroSelecionado) {
		this.tipoLivroSelecionado = tipoLivroSelecionado;
	}

	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public String getEditoraSelecionada() {
		return editoraSelecionada;
	}


	public void setEditoraSelecionada(String editoraSelecionada) {
		this.editoraSelecionada = editoraSelecionada;
	}


	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
	
}
