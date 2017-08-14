package ol;

import java.util.Random;
/*
 * Iniciando inspeção 14/08/2017 15:56
 * 
 */
public class Randomizador {
	private static final int SEED = 1111;
	private static final Random rand = new Random(SEED);
	private static final boolean useShared = true;

	public static Random getRandom() {
		if (useShared) {
			return rand;
		} else {
			return new Random();
		}
	}

	public static void reset() {
		if (useShared) {
			rand.setSeed(SEED);
		}
	}
}
