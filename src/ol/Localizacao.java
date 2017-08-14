package ol;

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
