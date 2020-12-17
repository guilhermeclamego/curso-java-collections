package br.com.alura;

import java.util.Comparator;
import java.util.List;

public class TesteCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com array", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com array", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula nova", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());

		List<Aula> listaAulas = javaColecoes.getAulas();
		
		
		
		listaAulas.forEach( aula -> System.out.println(aula));
	}
	
	
	
}
