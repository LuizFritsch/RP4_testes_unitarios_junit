package ol;

import java.util.Random;
/*
 * Iniciando inspeção de software 14 de agosto de 2017 as 23:00
 * Inspeção de software inicial finalizada em 14 de agosto de 2017 as 23:50
 * 
 * Iniciando Refatoração do código em 14 de agosto de 2017 as 23:50
 * Refatoração finalizada em 15 de agosto de 2017 as 00:03
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
