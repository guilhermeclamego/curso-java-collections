package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {

		//set não aceita objeto repetidos
		//Collection<String> alunos = new HashSet<>();  -> poderia ser instanciado assim, pois HashSet é interface de Collections
		Set<String> alunos = new LinkedHashSet<>();
		//LinkedHashSet retorna na ordem que foi adicionado, HashSet nao
				
		alunos.add("Guilherme Lamego");
		alunos.add("Guilherme Lamego");
		alunos.add("Jax Teller");
		alunos.add("Frank Lampard");
		alunos.add("Kurt Zouma");
		alunos.add("Olivier Giroud");
		alunos.add("Mendy");
		
		boolean estaMatriculado = alunos.contains("Guilherme Lamego x");		
		System.out.println(estaMatriculado);
		
		alunos.remove("Jax Teller");
		
		//Como ignora os dados repetidos o tamanho da lista também irá ficar sem o dado repetido
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		//Transforma o set em um arrayList, exemplo, caso precisar ordenar, o set não tem sort o arrayList tem. 
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
