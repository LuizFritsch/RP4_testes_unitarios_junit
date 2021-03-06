package ol;

import java.util.List;
import java.util.Random;

public class Ovelha extends Animal {
	private static final int IDADE_PROCRIACAO = 5;
	private static final int IDADE_MAXIMA = 40;
	private static final double PROBABILIDADE_PROCRIACAO = 0.15;
	private static final int TAMANHO_MAXIMO_NINHADA = 4;
	private static final Random rand = Randomizador.getRandom();

	public Ovelha(boolean randomAge, Campo campo, Localizacao localizacao) {
		super(campo, localizacao);
		if (randomAge) {
			idade = rand.nextInt(IDADE_MAXIMA);
		}
	}
	/*
	 * Se a ovelha n�o se move ela deve morrer? Acho que n�o faz sentido: Removido o
	 * setMorte(); Documentar isso: 10/09/17
	 * 
	 * 
	 * Nova altera��o, a ovelha tenta se mover, ent�o ela tenta dar a luz... nesse
	 * caso a possi��o dela pode gerar mais filhotes.
	 */

	public void corre(List<Ovelha> novasOvelhas) {
		incrementaIdade();

		if (vivo) {

			Localizacao newLocalizacao = campo.localizacaoAdjacenteLivre(localizacao);// Se ela n�o tiver campos livres
																						// ela morre?
			if (newLocalizacao != null) {
				setLocalizacao(newLocalizacao);
			}

			daALuz(novasOvelhas);
		}
	}

	// Deveria morrer quando chega na idade m�xima
	/*
	 * Ovelha n�o morria com a IDADE_MAXIMA apenas quando tinha IDADE_MAXIMA + 1
	 * M�todo refatorado e corrigido
	 */
	private void incrementaIdade() {
		idade++;
		if (idade >= IDADE_MAXIMA) {
			setMorte();
		}
	}

	/*
	 * M�todo n�o verifica quantos campos vazios existem
	 * 
	 * Refatorado - 15/09/2017 removido o esle extra.
	 */
	private void daALuz(List<Ovelha> novasOvelhas) {
		List<Localizacao> livre = campo.localizacoesAdjacentesLivres(localizacao);
		int nascimentos = procria();
		for (int b = 0; b < nascimentos; b++) {
			if (!livre.isEmpty()) {
				Localizacao loc = livre.remove(0);
				Ovelha jovem = new Ovelha(false, campo, loc);
				novasOvelhas.add(jovem);
			}
		}
	}

	/*
	 * Refatorado - 15/09/2017 ovelha morta poderia dar a Luz.
	 */

	private int procria() {
		int nascimentos = 0;
		if (this.vivo && podeProcriar() && rand.nextDouble() <= PROBABILIDADE_PROCRIACAO) {
			nascimentos = rand.nextInt(TAMANHO_MAXIMO_NINHADA) + 1;
		}
		return nascimentos;
	}

    /*
     * Refatorar
     */
	private boolean podeProcriar() {
		if (this.vivo && idade >= IDADE_PROCRIACAO) {
			return true;
		}
		return false;
	}
}
