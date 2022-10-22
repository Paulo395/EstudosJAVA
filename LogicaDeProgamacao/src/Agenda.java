import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	
	//private Contato[] agenda = new Contato[10];
	private List <Contato> agenda = new ArrayList<Contato>();
	
	public void armazenaPessoa(String nome,String telefone,String email){
		agenda.add(new Contato(nome,telefone,email));
	}
	
	public void removePessoa(String nome) {
		Integer i = this.buscarPessoa(nome);
		if(i!=null) {
			agenda.remove(i.intValue());
		} else {
			System.out.println("Contato não encontrado!");
		}
	}
	
	private Integer buscarPessoa(String nome) {
		for(int i=0;i<agenda.size();i++) {
			if (agenda.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return null;
	}
	
	public void imprimeAgenda() {
		/*for(int i = 0;i<agenda.size();i++) {
			Agenda.get irá retornar o objeto, e apos isso o metodo referente ao atributo
			System.out.println(agenda.get(i).getNome() + "\n"
					+ agenda.get(i).getTelefone() + "\n"
					+ agenda.get(i).getEmail() + "\n");
		}
		agenda.forEach(contato -> {
			//Aqui não é necessario usar getts
			//System.out.println(agenda.toString());
			System.out.println(contato.getNome() + "\n"
					+ contato.getTelefone() + "\n"
					+ contato.getEmail() + "\n");
		});*/
		System.out.println(agenda.toString());
	}
	
	public void imprimePessoa(int index) {
		System.out.println(agenda.get(index).toString());
	}
	
}
