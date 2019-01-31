package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	
	private String tipo_de_veiculo, marca, modelo, cor, placa;
	private List<Usuario> proprietario = new ArrayList<>();


	Veiculo(Usuario proprietario, String tipo_de_veiculo, String marca, String modelo, String cor, String placa){
		this.proprietario.add(proprietario);
		this.tipo_de_veiculo = tipo_de_veiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	public String toString() {
		return this.proprietario + "\nTipo de Veículo: " + this.tipo_de_veiculo +
				"\nMarca: " + this.marca + "\nModelo: " + this.modelo +
				"\nCor: " + this.cor + "\nPlaca: " + this.placa;
	}

	public String getTipo_de_veiculo() {
		return tipo_de_veiculo;
	}

	public void setTipo_de_veiculo(String tipo_de_veiculo) {
		this.tipo_de_veiculo = tipo_de_veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public List<Usuario> getProprietario() {
		return this.proprietario;
	}

	public void setProprietario(List<Usuario> proprietario) {
		this.proprietario = proprietario;
	}
	
}

