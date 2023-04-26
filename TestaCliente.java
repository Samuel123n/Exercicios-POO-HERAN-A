package POO_Exercicios;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Samuel", "souza", 1.87f, 23, 83.45);
		cliente1.visualizar();

		Cliente cliente2 = new Cliente("Felipe", "sousa", 1.64f, 28, 70);
		cliente2.visualizar();

		Cliente cliente3 = new PessoaFisica("Gabriel", "marques", 1.87f, 56, 65, "23459825617", "574839585");
		cliente3.visualizar();

		Cliente cliente4 = new PessoaFisica("Matheus", "marques", 1.87f, 56, 65, "23459825627", "774835585");
		cliente4.visualizar();

		Cliente cliente5 = new PessoaJuridica("Daniel", "marques", 1.87f, 56, 65, "23759925627");
		cliente5.visualizar();

		Cliente cliente6 = new PessoaJuridica("Gabriel", "souza", 1.87f, 56, 65, "23759925627");
		cliente6.visualizar();

	}

}