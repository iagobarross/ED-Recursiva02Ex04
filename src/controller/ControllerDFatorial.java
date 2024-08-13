//4. Faça uma função recursiva que receba um número inteiro positivo ímpar N e retorne o fatorial duplo desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o produto de todos os números naturais ímpares de 1 até algum número natural ímpar N.
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
