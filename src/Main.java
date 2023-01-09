import java.util.Scanner;
public class Main {

	
	public static void main(String[] args)
	{Evento evento = new Evento("Evento 1", "01/01/2020", 100, 100);
    Ingresso ingresso = new Ingresso();

    Scanner scanner = new Scanner(System.in);

    ingresso.imprimirValor();

    
    System.out.println("Digite o seu nome: ");
    String nome = scanner.nextLine();
    System.out.println("Digite o seu cpf: ");
    String cpf = scanner.nextLine();
    System.out.println("Escolha uma das opções: (1) Pista, (2) VIP, (3) Camarote");
    int tipo = scanner.nextInt();
    scanner.close();
    

    evento.venderIngresso(nome, cpf, tipo);

    System.out.println("Quantidade de ingressos vendidos até o momento: " + evento.quantidadeIngressosvendidos());
    }
	}
        
       
        
        

	


