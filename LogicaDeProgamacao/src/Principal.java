import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		Scanner t = new Scanner(System.in);
		String opcao;
		
		do {
			System.out.println("\tAgenda de Contatos\n"
					+ "1- Inserir contato\n"
					+ "2- Remover contato\n"
					+ "3- Listar todos os contatos\n"
					+ "4- Listar um contato\n"
					+ "5- Sair\n");
			
			opcao = t.next();
			
			switch (opcao) {
			case "1":
				agenda.armazenaPessoa("Paulo", "12345678", "tututu@gmail.com");
				break;
			case "2":
				System.out.print("Informe o nome: ");
				agenda.removePessoa(t.next());
				break;
			case "3":
				agenda.imprimeAgenda();
				break;
			case "4":
				agenda.imprimePessoa(0);
				break;
			case "5":
				System.out.println("Saindo do sistema.....");
				break;
			default:
				System.out.println("Comando invalido!");
				break;
			}
			
		} while(opcao!="6");
		
		/*
		agenda.armazenaPessoa("Paulo", "12345678", "tututu@gmail.com");
		agenda.armazenaPessoa("Henrique", "87654321", "papapa@gmail.com");
		agenda.imprimeAgenda();
		*/
	}

}
