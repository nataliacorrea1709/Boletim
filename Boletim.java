//Natália da silva Corrêa, 352.

package Boletim;

public class Boletim {
	
	public static void main(String[] args) {
		
		float media;
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Joãozinho";
		aluno1.nota1 = 9.6f;
		aluno1.nota2 = 9.3f;
		aluno1.nota3 = 9.7f;
		aluno1.nota4 = 9.4f;

		media = ((aluno1.nota1 + aluno1.nota2 + aluno1.nota3 + aluno1.nota4)/4);
		 
		Professor professor1 = new Professor();
		professor1.disciplina = "Matemática";

	  System.out.println(aluno1.nome + " tem media " + media +" na disciplina de " + professor1.disciplina );
	}
}