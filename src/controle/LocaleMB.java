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
public class LocaleMB {
	
	private Map<String, Locale> linguagens;
	
	private String localeInformed;
	
	public LocaleMB() {
		linguagens = new HashMap<String, Locale>();
		linguagens.put("English", Locale.ENGLISH);
		linguagens.put("Portugês", new Locale("pt", "BR"));
		FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.ENGLISH);
	}
	
	public void mudaIdioma(ValueChangeEvent e){
		String lang = e.getNewValue().toString();
		FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)new Locale(lang));
	}

	public Map<String, Locale> getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(Map<String, Locale> linguagens) {
		this.linguagens = linguagens;
	}

	public String getLocaleInformed() {
		return localeInformed;
	}

	public void setLocaleInformed(String localeInformed) {
		this.localeInformed = localeInformed;
	}


}
