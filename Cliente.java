package POO_Exercicios;

public class Cliente {

	private String nome;
	private String sobreNome;
	private float altura;
	private int idade;
	private double peso;

	// criar o metodo construtor
	public Cliente(String nome, String sobreNome, float altura, int idade, double peso) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
	}

	// criação dos set,get

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void visualizar() {
		System.out.println("Cliente " + nome + "- Sobrenome " + sobreNome + "- altura:" + altura + ", idade:" + ""
				+ idade + ", peso:" + peso);

	}

}