public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		conta.setAgencia(-40);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337, 24216);
		Conta conta3 = new Conta(1337, 24236);
		Conta conta4 = new Conta(1337, 24246);
		
		System.out.println(Conta.getTotal());

	}
}
