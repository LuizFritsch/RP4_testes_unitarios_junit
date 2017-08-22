package ol;

import java.util.Random;

public class Animal {
	
	protected int idade;
	protected boolean vivo;
	protected Localizacao localizacao;
	protected Campo campo;
	
	public Animal(Campo campo, Localizacao localizacao) {
		idade = 0;
		vivo = true;
		this.campo = campo;
		setLocalizacao(localizacao);
	}
	
	public boolean estaVivo() {
		return vivo;
	}
	
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	
	
	/*
	 * Localizações com valores negativos ainda me parece problema para esse metodo. VERIFICAR ISSO!!
	 */
	protected void setLocalizacao(Localizacao newLocalizacao) {
		if (localizacao != null) {
			campo.limpa(localizacao);
		}
		if(newLocalizacao.getLinha()> campo.getProfundidade() || newLocalizacao.getColuna() > campo.getLargura()) {
			throw new IllegalArgumentException();
		}
		localizacao = newLocalizacao;
		campo.lugar(this, newLocalizacao);
	}
	
	public void setMorte() {
		vivo = false;
		if (localizacao != null) {
			campo.limpa(localizacao);
			localizacao = null;
			campo = null;
		}
	}
	
	
	
}
