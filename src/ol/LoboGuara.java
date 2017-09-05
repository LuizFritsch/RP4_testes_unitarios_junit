package ol;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class LoboGuara extends Animal{
	private static final int IDADE_PROCRIACAO = 10;
	private static final int IDADE_MAXIMA = 150;
	private static final double PROBABILIDADE_PROCRIACAO = 0.75;
	private static final int TAMANHO_MAXIMO_NINHADA = 5;
	private static final int VALOR_FOME_OVELHA = 7;
	private static final Random rand = Randomizador.getRandom();

	private int nivelFome;

	public LoboGuara(boolean idadeRandomica, Campo campo, Localizacao localizacao) {
		super(campo, localizacao);
		if (idadeRandomica) {
			idade = rand.nextInt(IDADE_MAXIMA);
			nivelFome = rand.nextInt(VALOR_FOME_OVELHA);
		} else {
			nivelFome = VALOR_FOME_OVELHA;
		}
	}

	public void caca(List<LoboGuara> novosLobos) {
		incrementaIdade();
		if (vivo) {
			daALuz(novosLobos);
			Localizacao newLocalizacao = procuraComida(localizacao);
			if (newLocalizacao == null) {
				newLocalizacao = campo.localizacaoAdjacenteLivre(localizacao);
			}
			if (newLocalizacao != null) {
				setLocalizacao(newLocalizacao);
			} else {
				setMorte();
			}
		}
	}

	private void incrementaIdade() {
		idade++;
		if (idade >= IDADE_MAXIMA) {
			setMorte();
		}
	}

	private void decrementaFome() {
		nivelFome--;
		if (nivelFome == 0) {
			setMorte();
		}
	}

	private Localizacao procuraComida(Localizacao localizacao) {
		List<Localizacao> adjacente = campo.localizacoesAdjacentes(localizacao);
		Iterator<Localizacao> it = adjacente.iterator();
		while (it.hasNext()) {
			Localizacao onde = it.next();
			Object animal = campo.getObjectAt(onde);
			if(animal instanceof Ovelha) {
				Ovelha ovelha = (Ovelha) animal;
				ovelha.setMorte();
				nivelFome = VALOR_FOME_OVELHA;
				return onde;
			}
			
		}
		return null;
	}

	
	private void daALuz(List<LoboGuara> novosLobos) {
		List<Localizacao> livre = campo.localizacoesAdjacentesLivres(localizacao);
		int nascimentos = procria();
		for (int b = 0; b < nascimentos; b++) {
			if(!livre.isEmpty()) {
				Localizacao loc = livre.remove(0);
				LoboGuara jovem = new LoboGuara(false, campo, loc);
				novosLobos.add(jovem);
			}else {
				break;
			}
		}
	}

	/*
	 * No if ao invez de '<' deveria ser '<=' para atender a probabilidade certa
	 */
	private int procria() {
		int nascimentos = 0;
		if (podeProcriar() && rand.nextDouble() <= PROBABILIDADE_PROCRIACAO) {
			nascimentos = rand.nextInt(TAMANHO_MAXIMO_NINHADA) + 1;
		}
		return nascimentos;
	}

	/*
	 * M�todo refatorado
	 * Substituido '>' por '>=' para possibilitar que um lobo na idade correta j� posso procriar
	 */
	private boolean podeProcriar() {
		return idade >= IDADE_PROCRIACAO;
	}
	
	
}