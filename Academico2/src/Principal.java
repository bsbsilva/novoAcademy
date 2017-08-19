import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
	
 Aluno a1=new Aluno("Silva","21606013",LocalDate.of(1986, 07 , 18 ),"Masculino");
 Aluno a2 = new Aluno ("Marina", "22616114",LocalDate.of(2006,8,9 ),"Femenino");
 Disciplina b1= new Disciplina ("LTP1","Ciência da Computação", 10);
 Professor c1 = new Professor ("Marcos","333","Mestre","123.456.789-10");
 Turma d1 = new Turma (3,"Marcos","Ciencia da computação", null);
 

 
 
           //Aluno
	System.out.println(a1.imprimirAluno() + "\n");
	System.out.println(a2.imprimirAluno() + "\n");
 
	// /disciplina
	System.out.println("Disciplina");
	System.out.println("Nome da Disciplina:  "  + b1.getNome());
	System.out.println("Curso:  "   + b1.getCurso());
	System.out.println("Carga horária:  "  + b1.getCargaHoraria() + "\n");
	
	        // Professor
	System.out.println("Professor");
	System.out.println("Nome:  "   + c1.getNome());
	System.out.println("Matrícula:   "   + c1.getMatricula());
	System.out.println("Titulação: "  + c1.getTitulação());
	System.out.println("CPF:  "+ c1.getCPF() + "\n");
	
	          // Turma 
	System.out.println("Turma");
	System.out.println("Código:  "  + d1.codigo);
	System.out.println("Professor:  " + d1.professor);
    System.out.println("Disciplina: "  + d1.getDisciplina());
	
	
	
	// Adicionar a1 em d1
	
	//d1.adcionarAluno(a1);
	
	//System.out.println(d1.getAlunos(a2, a1).get(0).getNome());
	//d1.adcionarAluno(a2);
	
	
		
		
		
	}
	

}
