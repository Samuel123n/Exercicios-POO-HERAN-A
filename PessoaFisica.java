package POO_Exercicios;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String rg;

	public PessoaFisica(String nome, String sobreNome, float altura, int idade, double peso, String cpf, String rg) {
		super(nome, sobreNome, altura, idade, peso);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void visualizar() {
		System.out.println("Cliente " + getNome() + "- Sobrenome " + getSobreNome() + "- altura:" + getAltura()
				+ ", idade:" + "" + getIdade() + ", peso: " + getPeso() + "CPF: " + cpf + "rg: " + rg);
	}

}