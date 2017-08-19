import java.time.LocalDate;

public class Aluno {
	public static String a2;
	private String nome;
	private String RA;
	private LocalDate datadeNascimento;
	private String sexo;
	
	
	public Aluno(String nome, String RA, LocalDate datadeNascimento, String sexo) {
		super();
		this.nome = nome;
		this.RA = RA;
		this.datadeNascimento = datadeNascimento;
		this.sexo = sexo;
	}
	
	
	
	
	  //----------------------------------------------------------------------------
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getRA() {
		return RA;
	}




	public void setRA(String RA, String RA1) {
		this.RA = RA1;
	}




	public LocalDate getDatadeNascimento() {
		return datadeNascimento;
	}




	public void setDatadeNascimento(LocalDate datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public String imprimirAluno (){
		return "Aluno\n" +
	           "Nome:   " + getNome()  +  "\n"  +
			   "RA:     " + getRA()     +  "\n"  +
	           "Data de Nascimento:  " + getDatadeNascimentoComoString()  +  "\n"  +
			   "Sexo:   " + getSexo();
		
		}

		public String imprimirAluno2 (){
			return "Aluno\n" +
		           "Nome:   " + getNome()  +  "\n"  +
				   "RA:     " + getRA()     +  "\n"  +
		           "Data de Nascimento:  " + getDatadeNascimentoComoString()  +  "\n"  +
				   "Sexo:   " + getSexo();
}




	private String getDatadeNascimentoComoString() {
		return datadeNascimento.getDayOfMonth()+ "/" + 
		           this.datadeNascimento.getMonthValue()+ "/" +
					this.datadeNascimento.getYear();
	}
	
	
	
}
