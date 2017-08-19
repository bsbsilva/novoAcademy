import java.time.LocalDate;
//import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		
	

 Disciplina b1= new Disciplina ("LTP1","Ciência da Computação", 10);
 Professor c1 = new Professor ("Marcos","333","Mestre","123.456.789-10");
 Turma d1 = new Turma (3,"Marcos","Ciencia da computação", null);
 

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
	
 	
 	
		
 	
 	//  Intanciar objetos  da classe aluno
 	
 	Aluno a1=new Aluno("Silva","21606013",LocalDate.of(1986, 07 , 18 ),"Masculino");
 	 Aluno a2 = new Aluno ("Marina", "22616114",LocalDate.of(2006,8,9 ),"Femenino");
 	Aluno a3=new Aluno("Luiz ","22626215",LocalDate.of(2009, 12 , 30 ),"Masculino");
	Aluno a4=new Aluno("Sophia","23636316",LocalDate.of(2008, 12 , 30 ),"Femenino");
	Aluno a5=new Aluno("Taylor","24646416",LocalDate.of(2010, 02 , 18 ),"Masculino");
	Aluno a6=new Aluno("Valentina","25656517",LocalDate.of(2017, 04 , 24 ),"Femenino");
	
	
 	 
 	 
 	 

     //imprimir Aluno
System.out.println(a1.imprimirAluno() + "\n");
System.out.println(a2.imprimirAluno() + "\n");
System.out.println(a3.imprimirAluno() + "\n");
System.out.println(a4.imprimirAluno() + "\n");
System.out.println(a5.imprimirAluno() + "\n");
System.out.println(a6.imprimirAluno() + "\n");


      // Adicionar a1 em d1
     d1.adicionarAluno(a1);
     d1.adicionarAluno(a2);
     d1.adicionarAluno(a3);
     d1.adicionarAluno(a4);
     d1.adicionarAluno(a5);
     d1.adicionarAluno(a6);
	
     //Navegar pela estrutura de doArraylista de alunos que esta dentro da turma
     
    // ArrayList<Aluno> alunos = d1.getAlunos();
     
    // for (int i = 0; i < d1.getAlunos().size(); i++) {
    	 //System.out.println(d1.getAlunos().get(i).getNome());
    	 
    	 
    	 System.out.println(d1.listarAlunos());
    	 
    	 
    	 
    	 
    	 //Determinar  mencção e aprovação na nota
    	/* double nota = 7.8;
    	 //String mencao = "";
    	// String resultado = "";
    	// System.out.println("menção: " + mencao + "e Resultado" + resultado);
    	 */
    	 
    	 Calculadora e1 = new Calculadora ();
    	 System.out.println("Menção :   " + e1.calcularMencao(9.7));
    	 
    	 
			}

			

		}
    	 
    	 
    	 
    	 
    	 
	
    	 
    	
 		
    	 
    	 
    	 
    	 
		
	
	
	


