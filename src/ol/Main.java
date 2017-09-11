package ol;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Simulador s = new Simulador();
		int i = 1;
		int j =0;
		
		do {
		System.out.println("Digite um inteiro");
		i = scan.nextInt();
		s.simulacao(j);
		  j=j+1;
		  System.out.println(j);
		}while(i!=0);
	}
}
