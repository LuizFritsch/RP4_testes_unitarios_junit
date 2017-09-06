package ol;

import java.util.Random;
/*
 * Iniciando inspe��o de software 14 de agosto de 2017 as 23:00
 * Inspe��o de software inicial finalizada em 14 de agosto de 2017 as 23:50
 * 
 * Iniciando Refatora��o do c�digo em 14 de agosto de 2017 as 23:50
 * Refatora��o finalizada em 15 de agosto de 2017 as 00:03
 */
public class Randomizador {
	private static Random rand = null;

	private Randomizador() {
		
	}
	
	public static Random getRandom() {
		if (rand != null) {
			return rand;
		} else {
			rand = new Random(111);
			return rand;
		}
	}

	public static void reset() {
		rand = new Random();
	}
}
