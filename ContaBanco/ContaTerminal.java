import java.util.Scanner;
public class ContaTerminal{
   public static void main(String[] args) throws Exception{
      // TODO: Conhecer e importar a classe Scanner
      Scanner sc = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in); // Tive que criar um segundo scanner pois estava com comportamento indesejado

      // Exibir as mensagem para o nosso usuário
      // Obter pela scanner os valores digitados no terminal
      System.out.println("Digite o número da conta:");
      int numero = sc.nextInt();

      System.out.println("Digite a agência da conta:");
      String agencia = sc2.nextLine();

      System.out.println("Agora digite o nome do cliente:");
      String nome = sc2.nextLine();

      System.out.println("Digite o saldo inicial[primeiro depósito]:");
      Double saldo = sc.nextDouble();


      sc.close();
      sc2.close();

      // Exibir a mensagem conta criada
      // Utilizei a StringBuilder devido(String ser imutável) e a forma que trabalha com string em memória
      StringBuilder message = new StringBuilder();
      message.append("Olá ");
      message.append(nome);
      message.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
      message.append(agencia);
      message.append(", conta ");
      message.append(numero);
      message.append(" e seu saldo ");
      message.append(String.format("%.2f", saldo));
      message.append(" já está disponível para saque.");
      System.out.println(message.toString());

   }
}