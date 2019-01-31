package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

public class Servidor extends Usuario {
	
	private String cargo;
	
	Servidor(String nome, String matricula, String cargo){
		super(nome, matricula);
		this.cargo = cargo;	
	}
	
	public String toString() {
		return super.toString() + "\nCargo: " + this.cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
