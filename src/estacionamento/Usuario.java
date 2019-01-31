package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

public class Usuario {
	
	private String nome, matricula;
	
	Usuario(String nome, String matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nMatricula: " + this.matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
