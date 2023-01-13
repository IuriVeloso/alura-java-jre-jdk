public class TesteMetodo {
	public static void main (String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiu = contaDoPaulo.saca(20);
		
		System.out.println(contaDoPaulo.saldo);
		
		System.out.println(conseguiu);
	
		Conta contaDoMarcelo = new Conta();
		
		contaDoMarcelo.deposita(1000);
		
		contaDoMarcelo.transfere(300, contaDoPaulo);
		
		System.out.println(contaDoMarcelo.saldo);
		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		
		System.out.println(contaDoPaulo.titular);
		
	}

}
