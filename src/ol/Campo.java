package ol;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Campo {
	private static final Random rand = Randomizador.getRandom();

	private int profundidade, largura;
	private Object[][] campo;

	public Campo(int profundidade, int largura) {
		this.profundidade = profundidade;
		this.largura = largura;
		campo = new Object[profundidade][largura];
	}

	public void limpa() {
		for (int linha = 0; linha < profundidade; linha++) {
			for (int coluna = 0; coluna < largura; coluna++) {
				campo[linha][coluna] = null;
			}
		}
	}

	public void limpa(Localizacao localizacao) {
		campo[localizacao.getLinha()][localizacao.getColuna()] = null;
	}

	public void lugar(Animal animal, int linha, int coluna) {
		lugar(animal, new Localizacao(linha, coluna));
	}

	public void lugar(Animal animal, Localizacao localizacao) {
		if(animal instanceof LoboGuara || animal instanceof Ovelha) {
			if(campo[localizacao.getLinha()][localizacao.getColuna()]==null) {
				campo[localizacao.getLinha()][localizacao.getColuna()] = animal;
			}else {
				throw new IllegalArgumentException("Posi��o j� ocupada!");
			}
			
		}else {
			throw new IllegalArgumentException("Dado inv�lido!(O dado inserido n�o � uma das herdeiras de Animal!");
		}
		
	}

	public Animal getObjectAt(Localizacao localizacao) {
		return getObjectAt(localizacao.getLinha(), localizacao.getColuna());
	}

	
	/*
	 * Refatora��o do metodo. Return animal agora. FAZER NOVOS TESTES!!!
	 */
	public Animal getObjectAt(int linha, int coluna) {
		if(campo[linha][coluna]!=null) {
			
			return (Animal) campo[linha][coluna];
		}
		return null;
	}

	public Localizacao localizacaoAdjacenteRandomica(Localizacao localizacao) {
		List<Localizacao> adjacent = localizacoesAdjacentes(localizacao);
		if(adjacent.size()>0) {
			return adjacent.get(0);
		}
		return null;
	}

	public List<Localizacao> localizacoesAdjacentesLivres(Localizacao localizacao) {
		List<Localizacao> livre = new LinkedList<Localizacao>();
		List<Localizacao> adjacente = localizacoesAdjacentes(localizacao);
		for (Localizacao proximo : adjacente) {
			if (getObjectAt(proximo) == null) {
				livre.add(proximo);
			}
		}
		return livre;
	}

	public Localizacao localizacaoAdjacenteLivre(Localizacao localizacao) {
		List<Localizacao> livre = localizacoesAdjacentesLivres(localizacao);
		if (livre.size() > 0) {
			return livre.get(0);
		} else {
			return null;
		}
	}

	public List<Localizacao> localizacoesAdjacentes(Localizacao localizacao) {//Pode dar IndexOutOfBoundsException Preciso de testes para Provar isso
		assert localizacao != null : "Null localizacao passed to adjacentLocalizacoes";
		List<Localizacao> localizacoes = new LinkedList<Localizacao>();
		if (localizacao != null) {
			if(localizacao.getColuna() < this.largura && localizacao.getLinha() < this.profundidade) {
				int linha = localizacao.getLinha();
				int coluna = localizacao.getColuna();
				for (int roffset = -1; roffset <= 1; roffset++) {
					int proximaLinha = linha + roffset;
					if (proximaLinha >= 0 && proximaLinha < profundidade) {
						for (int coffset = -1; coffset <= 1; coffset++) {
							int proximaColuna = coluna + coffset;
							if (proximaColuna >= 0 && proximaColuna < largura && (roffset != 0 || coffset != 0)) {
								localizacoes.add(new Localizacao(proximaLinha, proximaColuna));
							}
						}
					}
<<<<<<< Updated upstream
				}
=======
				} 
>>>>>>> Stashed changes
				Collections.shuffle(localizacoes, rand);
			
			}else {
				throw new IllegalArgumentException();
			}
			
		}
		return localizacoes;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public int getLargura() {
		return largura;
	}

}
