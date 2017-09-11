	package ol;

import java.util.List;
import java.util.Random;

public class Ovelha extends Animal{
	private static final int IDADE_PROCRIACAO = 5;
	private static final int IDADE_MAXIMA = 40;
	private static final double PROBABILIDADE_PROCRIACAO =0.15;
	private static final int TAMANHO_MAXIMO_NINHADA = 4;
	private static final Random rand = Randomizador.getRandom();

	public Ovelha(boolean randomAge, Campo campo, Localizacao localizacao) {
		super(campo, localizacao);
		if (randomAge) {
			idade = rand.nextInt(IDADE_MAXIMA);
		}
	}
	/*
	 * Se a ovelha não se move ela deve morrer? Acho que não faz sentido: Removido o setMorte(); Documentar isso: 10/09/17
	 */
	
	public void corre(List<Ovelha> novasOvelhas) {
		incrementaIdade();
		
		if (vivo) {
			
			daALuz(novasOvelhas);
			Localizacao newLocalizacao = campo.localizacaoAdjacenteLivre(localizacao);// Se ela não tiver campos livres ela morre?
			if (newLocalizacao != null) {
				setLocalizacao(newLocalizacao);
			} else {
				
			}
		}
	}

	// Deveria morrer quando chega na idade máxima
	/*
	 *  Ovelha não morria com a IDADE_MAXIMA apenas quando tinha IDADE_MAXIMA + 1
	 *  Método refatorado e corrigido 
	 */
	private void incrementaIdade() {
		idade++;
		if (idade >= IDADE_MAXIMA) {
			setMorte();
		}
	}
/*
 * Método não verifica quantos campos vazios existem
 */
	private void daALuz(List<Ovelha> novasOvelhas) {
		List<Localizacao> livre = campo.localizacoesAdjacentesLivres(localizacao);
		int nascimentos = procria();
		for (int b = 0; b < nascimentos; b++) {
			if(!livre.isEmpty()) {
				Localizacao loc = livre.remove(0);
				Ovelha jovem = new Ovelha(false, campo, loc);
				novasOvelhas.add(jovem);
			}else {
				break;
			}
		}
	}

	
	private int procria() {
		int nascimentos = 0;
		if (podeProcriar() && rand.nextDouble() <= PROBABILIDADE_PROCRIACAO) {
			nascimentos = rand.nextInt(TAMANHO_MAXIMO_NINHADA) + 1;			
		}
		return nascimentos;
	}

	private boolean podeProcriar() {
		return idade >= IDADE_PROCRIACAO;
	}
}
