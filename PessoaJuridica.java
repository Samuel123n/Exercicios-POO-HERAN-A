package POO_Exercicios;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, String sobreNome, float altura, int idade, double peso, String cnpj) {
		super(nome, sobreNome, altura, idade, peso);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		System.out.println("Cliente " + getNome() + "- Sobrenome " + getSobreNome() + "- altura:" + getAltura()
				+ ", idade:" + "" + getIdade() + ", peso: " + getPeso() + "cnpj: " + getCnpj());

	}
}