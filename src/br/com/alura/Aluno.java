package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Informe o nome");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " Matricula: " + this.getNumeroMatricula() ;
	}
	
	//Assim, a estrutura ficara "espalhada" usando o hash pelo primeiro caracter do nome, assim diminui colisoes na tabela de espalhamento
	@Override
	public int hashCode() {
		return this.nome.charAt(0);
	}
	
	//Sempre que for reescrito o equals, é necessário reescrever o hashCode
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
}
