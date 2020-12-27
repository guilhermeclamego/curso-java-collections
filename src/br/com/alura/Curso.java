package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;


public class Curso {
	/**
	 * Apenas com HashSet n�o ir� mostrar na ordem, por�m tera acesso aos getters 
	 * overide dos m�todos hashcode e equals da Classe Aluno, facilitar� essa ordena��o
	 * J� o LinkedHashSet, esse ir� retornar os dados na ordem que foi adicionada.
	 */
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList();
	//Com o LinkedHashSet ir� mostrar na ordem, n�o ter� acesso aos getters
	private Set<Aluno> alunos = new LinkedHashSet<>();
	//private Set<Aluno> alunos = new HashSet<>();
	
	//Cria��o do mapa, pra faciliar busca do aluno <key, value>
	private Map<Integer, Aluno> mapaAlunos = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getInstrutor() {
		return instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", total tempo " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.mapaAlunos.put(aluno.getNumeroMatricula(), aluno);
		
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaAluno(int matricula) {
		
		if(this.mapaAlunos.get(matricula) == null) {
			 throw new NoSuchElementException("Matricula n�o encontrada");
		}
		return this.mapaAlunos.get(matricula);
		
	}
}
