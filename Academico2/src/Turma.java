import java.util.ArrayList;
public class Turma {
	public int codigo;
	public String professor;
	public String disciplina;
	private ArrayList<Aluno> alunos;
	
	
	
	

	public Turma(int codigo, String professor, String disciplina, ArrayList<Aluno> alunos) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
		this.alunos = new  ArrayList<Aluno>();
	}

	public void adicionarAluno (Aluno aluno){
		this.alunos.add(aluno);
		
	}

	//--------------------------------------------------------------------
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
	this.disciplina = disciplina;
	}
	
	public  ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	public void setAlunos ( ArrayList<Aluno> alunos) {
		this.alunos = alunos;
		
	}
	//-----------------------------------------------------------------

	
	
	       public String listarAlunos(){
	    	   String retorno = "";
	    	   
	    	   // verificar se existem alunos na turma
	    	   
	    	   if (this.alunos.size() == 0) {
	    		   retorno = "Nenhum Aluno Resgiatrado na turma";
			}
	    	   else{
	    	      	   // navegar pela estrutura de alunos
	    	   for (int i = 0; i < this.alunos.size(); i++) {
	    		   retorno = retorno + "Nome: " + this.alunos.get(i).getNome() + "\n";
	    	   
	    		   
				
			}
			return retorno;
	       }
			return retorno;
	       
	       }

	
		
	}
	
	


