package Application;

import java.util.Scanner;

import Entities.carro;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe o valor do carro: ");
		carro c = new carro(sc.nextDouble());
		for (int i=0; i<30; i+= 6) {
			c.valores(i);
		}
		
		sc.close();
	}

}
