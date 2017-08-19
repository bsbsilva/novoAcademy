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
		this.alunos = alunos;
	}

	//public void adcionarAluno (Aluno aluno){
		//this.alunos.add(aluno);
		
	//}

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
	
	public  ArrayList<Aluno> getAlunos(Aluno a1, Aluno a2){
		return alunos;
	}
	
	public void setAlunos ( ArrayList<Aluno> alunos) {
		this.alunos = alunos;
		
	}
	//-----------------------------------------------------------------



	
		
	}
	
	


