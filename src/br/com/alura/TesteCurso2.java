package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCurso2 {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com array", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com array", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula nova", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);		
		
		/**
		 * getAulas est� com uma programa��o defensiva, para n�o ser alterado de fora do escopo da classe, defendendo assim o seu
		 * encapsulamento. Mas, assim, fica sem acesso para ordena��o, com isso, foi criado uma nova inst�ncia do ArrayList,
		 * passando aulasImutaveis (getLista) como par�metro, assim compilando sem erro, pois n�o ir� acessar diretamento o atributo
		 * encapsulado. 
		 */
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("Total de Tempo do curso: " + javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}
	
	
	
}
