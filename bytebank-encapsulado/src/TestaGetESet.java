
public class TestaGetESet {
	public static void main (String[] args) {
		Conta conta = new Conta();
		// conta.numero = 137;
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Coder");
		
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
