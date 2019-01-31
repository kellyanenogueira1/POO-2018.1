package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

public class Aluno extends Usuario{
	
	private String curso, semestre;
	
	Aluno(String nome, String matricula, String curso, String semestre){
		super(nome, matricula);
		this.curso = curso;
		this.semestre = semestre;	
	}

	public String toString() {
		return super.toString() + "\nCurso: " + this.curso +
				"\nSemestre: " + this.semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
}
