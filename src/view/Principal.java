package view;

import controller.ControllerDFatorial;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerDFatorial contDFat = new ControllerDFatorial();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			numero = sc.nextInt();
		} while (numero < 1 && numero % 2 == 0);
		
		int duploFatorial = contDFat.duploFatorial(numero);
		System.out.println("O duplo fatorial de " + numero + " é: " + duploFatorial);
		
	}

}
