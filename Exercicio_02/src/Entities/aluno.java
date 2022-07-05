package Entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class aluno {
	private int matriculaNumero;
	private ArrayList<Double> nota = new ArrayList<Double>();
	private int frequencia;
	private double notaFinal;
	

	public aluno(int matriculaNumero, ArrayList<Double> nota, int frequencia) {
		super();
		this.matriculaNumero = matriculaNumero;
		this.nota = nota;
		this.frequencia = frequencia;
	}
	
	public int getMatriculaNumero() {
		return matriculaNumero;
	}
	public void setMatriculaNumero(int matriculaNumero) {
		this.matriculaNumero = matriculaNumero;
	}

	public ArrayList<Double> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Double> nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	public String resultado(){
		if(this.notaFinal < 6) {
			return("reprovado");
		}else {
			return("aprovado");
		}
	}
	
	public Double maiorNota() {
		return Collections.max(nota);
	}
	
	@Override
	public String toString() {
		String res = resultado();
		return "Número da matrícula = " + matriculaNumero + ", nota final = " + notaFinal + "resultado: " + res;
	}
	
	
}
