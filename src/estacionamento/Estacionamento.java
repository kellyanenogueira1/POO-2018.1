package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

public class Estacionamento {
	
	private List<Veiculo> Cadastros = new ArrayList<>();
	private List<String> Historico = new ArrayList<String>();
	private int Qntd_Cadastros = 0;
	private int registro = 0;
	
	public String toString() {
		return "\nCadastros: " + Cadastros + "\n\nQuantidade de Cadastros: " + Qntd_Cadastros;
	}
	
	public void Cadastrar(Veiculo veiculo){
		if(!TemCadastro(veiculo)) {
			this.Qntd_Cadastros++;
			this.Cadastros.add(veiculo);
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			System.out.println(this.toString());
		}else {
			JOptionPane.showMessageDialog(null, "O veículo de placa " + veiculo.getPlaca() + " já foi cadastrado anteriormente!");
		}
	}
	
	public void Deletar(String placa){ 
		int aux = Buscar(placa);
		if(aux!=(-1)){
			JOptionPane.showMessageDialog(null, "O veículo de placa " + this.Cadastros.get(aux).getPlaca() + " foi removido!");
			this.Cadastros.remove(this.Cadastros.get(aux));
			this.Qntd_Cadastros--;
			System.out.println(this.toString());
		}else {
			JOptionPane.showMessageDialog(null, "O veículo de placa " + placa + " não foi encontrado nos cadastros!");
		}
	}
	
	public int Buscar(String placa) {
		for(int i=0; i<Cadastros.size(); i++) {
			if(Cadastros.get(i).getPlaca().equals(placa))
				return i;
		}
		return -1;
	}
	
	public String Exibir_Busca(String placa) {
		int aux = Buscar(placa);
		if(aux!=-1) {
			return "Proprietário do Veículo:" + Cadastros.get(aux).getProprietario() + "\nTipo de Veículo: " +
					Cadastros.get(aux).getTipo_de_veiculo() + "\nMarca: " + Cadastros.get(aux).getMarca() + "\nModelo: " +
					Cadastros.get(aux).getModelo() + "\nCor: " + Cadastros.get(aux).getCor() + "\nPlaca: " + Cadastros.get(aux).getPlaca();
		}else {
			return "O veículo de placa " + placa + " não foi encontrado nos cadastros!";
		}
	}
	
	public void Editar(int index, String nome, String matricula, String marca, String modelo, String cor, String placa) {
		int aux = Buscar(placa);
		if(aux == index) {
			this.Cadastros.get(index).getProprietario().get(index).setNome(nome);;
			this.Cadastros.get(index).getProprietario().get(index).setMatricula(matricula);
			this.Cadastros.get(index).setMarca(marca);
			this.Cadastros.get(index).setModelo(modelo);
			this.Cadastros.get(index).setCor(cor);
			this.Cadastros.get(index).setPlaca(placa);
			JOptionPane.showMessageDialog(null, "Alterações salvas!");
			System.out.println(this.toString());
		}else if(aux == -1 && this.Cadastros.get(index).getPlaca()!=placa){
			this.Cadastros.get(index).getProprietario().get(index).setNome(nome);;
			this.Cadastros.get(index).getProprietario().get(index).setMatricula(matricula);
			this.Cadastros.get(index).setMarca(marca);
			this.Cadastros.get(index).setModelo(modelo);
			this.Cadastros.get(index).setCor(cor);
			this.Cadastros.get(index).setPlaca(placa);
			JOptionPane.showMessageDialog(null, "Alterações salvas!");
			System.out.println(this.toString());
		}else {
			JOptionPane.showMessageDialog(null, "O veículo de placa " + placa + " já foi cadastrado anteriormente!");
		}
	}
	
	public List<Veiculo> Preencher() {
		return Cadastros;
	}
	
	public String Logar_Estacionamento(String placa) {
		if(Buscar(placa) != -1) {
			Calendar agora = Calendar.getInstance();
			int hs = agora.get(Calendar.HOUR_OF_DAY);
			int min = agora.get(Calendar.MINUTE);
			int seg = agora.get(Calendar.SECOND);
			int dia = agora.get(Calendar.DAY_OF_MONTH);
			int mes = agora.get(Calendar.MONTH);
			int ano = agora.get(Calendar.YEAR);
			Historico(placa, hs, min, seg, dia, mes, ano);
			if(this.registro%2==0) {
				return "\nO veículo de placa " + placa + " entrou o estacionamento em\nHora: " + hs + ":" + min + ":" + seg +
						"\nData: " + dia + "/" + mes + ":" + ano;
			}else {
				return "\nO veículo de placa " + placa + " saiu o estacionamento em\nHora: " + hs + ":" + min + ":" + seg +
						"\nData: " + dia + "/" + mes + ":" + ano;	
			}
		}else {
			return "\nO veículo de placa " + placa + " não foi encontrado nos cadastros!";
		}
	}
	
	public void Historico(String placa, int hs, int min, int seg, int dia, int mes, int ano) {
		Historico.add("O veículo de placa " + placa + "acessou o estacionamento em\nHora: " + hs + ":" + min + ":" + seg +
					"\nData: " + dia + "/" + mes + ":" + ano);
	}
	
	public boolean TemCadastro(Veiculo veiculo) {
		for(int i=0; i<Cadastros.size(); i++) {
			if(Cadastros.get(i) != null && Cadastros.get(i).equals(veiculo)) {
				return true;
			}	
		}
		return false;
	}

}
