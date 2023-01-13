
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 19;
		int quantidadePessoas = 2;

		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor de acompanhado é " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Você tem menos de 18 anos");
		}
	}
}
