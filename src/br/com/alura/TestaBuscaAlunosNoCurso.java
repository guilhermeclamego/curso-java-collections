package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com array", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com array", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula nova", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Guilherme Lamego", 33747);
		Aluno a2 = new Aluno("Jax Teller", 3474);
		Aluno a3 = new Aluno("Kurt Zouma", 8587);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Aluno aluno = javaColecoes.buscaAluno(33747);
		System.out.println("Aluno da busca: " + aluno.getNome());
	}
}
