package br.com.alura;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados nesse curso: ");
		javaColecoes.getAlunos().forEach( a -> System.out.println(a));
		System.out.println("");
		
		System.out.println("O aluno: " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno lamego = new Aluno("Guilherme Lamego", 33747);
		System.out.println("E esse lamego está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(lamego));
		System.out.println("");
		
		System.out.println("o A1 é igual a instância lamego?");
		System.out.println(a1.equals(lamego));
		System.out.println("");
		
		System.out.println("hashCode a1 é igual ao hashCode lamego");
		System.out.println(a1.hashCode() == lamego.hashCode());
	}
}
