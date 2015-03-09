package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Livro;


@ManagedBean(name="livroMB")
@RequestScoped
public class LivroMB {

	//dados da tela
	private Livro livro = new Livro();
	//private LivroDAO dao = new LivroDAO();
	
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
	
	
	
}
