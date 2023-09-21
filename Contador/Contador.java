import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		}catch ( ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		terminal.close();

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois<=parametroUm){
         throw new ParametrosInvalidosException(" O segundo parâmetro deve ser maior que o primeiro");
      }
		int contagem = parametroDois - parametroUm;
		System.out.println("Percorrendo contagem de (" + contagem + ")itens entre " + parametroUm + " e " + parametroDois );

		for(int n=1;n<=contagem;n++){
			System.out.println(n);
		}
		//realizar o for para imprimir os números com base na variável contagem
	}
}
