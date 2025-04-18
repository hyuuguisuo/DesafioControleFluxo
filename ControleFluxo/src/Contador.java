import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("> Digite o primeiro parâmetro \n");
		int parametroUm = terminal.nextInt();
		System.out.println("> Digite o segundo parâmetro \n");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.err.println("[ERRO] O segundo parametro deve ser MAIOR que o primeiro.");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++){
			System.out.println("imprimindo o número: "+i);
		}
	}
}
