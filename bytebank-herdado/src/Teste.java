
public class Teste {

	public static void main(String[] args) {
		Gerente f1 = new Gerente();
		
		f1.setSalario(3000);
		
		//System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		Gerente f2 = new Gerente();
		//f2.setTipo(2);
		f2.setSalario(5000);
		
		//System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
		
		
	}

}
