package teste;

import java.sql.PreparedStatement;

public class Cliente extends Pessoa {
	private double peso;
	private Endereco endereco;
	public Cliente(String cpf, String nome, String sexo, String data_nascimento, String[] tp_telefones, double peso, Endereco endereco) {
		super(cpf, nome, sexo, data_nascimento, tp_telefones);
		this.peso = peso;
		this.endereco = endereco;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString(){
		return "Nome: "+this.getNome()+"\n"+
				"Cpf: "	+this.getCpf()+"\n"+
				"Sexo: " +this.getSexo()+"\n"+
				"Data Nascimento: "+this.getData_nascimento()+"\n"+
				//"Telefone: "+this.getTp_telefones()"\n"+
				"CEP: "+this.endereco.getCep()+"\n"+
				"N�mero: "+this.endereco.getNumero()+"\n"+
				"Rua: "+this.endereco.getRua();
	}
	
	
}
