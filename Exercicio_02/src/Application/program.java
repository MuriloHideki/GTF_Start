package Application;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.aluno;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> nota = new ArrayList<Double>();
		
		for (int i=0; i<nota.size(); i++) {
			nota.add(sc.nextDouble());
		}
		
		aluno a = new aluno(1, nota, 3);
		
		
		sc.close();
	}

}
