package controle;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


@ManagedBean(name="lang")
@SessionScoped
public class LinguagemMB {
	
	private Map<String, Locale> idiomas;
	
	public LinguagemMB() {
       idiomas = new HashMap<String, Locale>();
       idiomas.put("Português", new Locale("pt", "BR"));
       idiomas.put("English", Locale.ENGLISH);
	}
	
	//Método que troca idioma da página inteira
	public void mudaIdioma(ValueChangeEvent e){
		String idSelec = e.getNewValue().toString();
		FacesContext.getCurrentInstance().getViewRoot()
		        .setLocale(new Locale(idSelec));		
	}
	
	public Map<String, Locale> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(Map<String, Locale> idiomas) {
		this.idiomas = idiomas;
	}
	
	
	
	
}




