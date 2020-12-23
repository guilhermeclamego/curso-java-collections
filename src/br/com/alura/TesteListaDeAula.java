package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayList", 21);
		Aula a2 = new Aula("Listas de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas de objeto", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);		
		Collections.sort(aulas); //Necessários implementar o Comparable (interface) na classe Aula e reescreve o método compareTo
		System.out.println("Ordenração de aulas pelo comparable overide");
		System.out.println(aulas);
		
		System.out.println("");
		
		//Comparação genérica, passando qualquer atributo da classe.
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println("Ordenação de aulas pelo Comparator.comparing");
		System.out.println(aulas);
	}

}
