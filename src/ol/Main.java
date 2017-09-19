package ol;



public class Main {
	public static void main(String[] args) {


		Simulador s = new Simulador(10,10);
		s.simulacaoUmaEtapa();
		s.simulacao(5);


		
		Simulador s1 = new Simulador(100,100);
		s1.executaLongaSimulacao();
	}
}
