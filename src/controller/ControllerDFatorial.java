//4. Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo �mpar N e retorne o fatorial duplo desse n�mero (A entrada deve ser validada fora da fun��o recursiva). O fatorial duplo � definido como o produto de todos os n�meros naturais �mpares de 1 at� algum n�mero natural �mpar N.
package controller;

public class ControllerDFatorial {
	
	public ControllerDFatorial() {
		super();
	}
	
	public int duploFatorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * duploFatorial(n - 2);
		}
	}
}
