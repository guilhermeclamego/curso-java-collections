package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);		
		aulas.remove(0);		
		System.out.println(aulas);
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		
		//Exemplos com todos os arrays
		for (String aula : aulas) {
			System.out.println("For com Foreach: " + aula);
		}
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("For normal: " + aulas.get(i));
		}
		
		aulas.forEach( aula -> System.out.println("For com Lambda: " + aula));
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("Antes de ordenar: " + aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenar: " + aulas);
		 
	}
}
