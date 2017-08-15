package ol;

/*
 * Iniciando inspeção de software 14 de agosto de 2017 as 23:00
 * Inspeção de software inicial finalizada em 14 de agosto de 2017 as 23:50
 * 
 * Iniciando Refatoração do código em 14 de agosto de 2017 as 23:50
 * Refatoração finalizada em 15 de agosto de 2017 as 00:03
 */

public class Localizacao {
	private int linha;
	private int coluna = 1;

	public Localizacao(int linha, int coluna) {

		if(linha>=0 && coluna>=0) {
			this.linha = linha;
			this.coluna = coluna;
		}
	}

	public boolean equals(Object obj) {
		if (obj instanceof Localizacao) {
			Localizacao outra = (Localizacao) obj;
			return linha == outra.getLinha() && coluna == outra.getColuna();
		} else {
			return false;
		}
	}

	public String toString() {
		return linha + "," + coluna;
	}

	public int hashCode() {
		return (linha << 16) + coluna;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
}
