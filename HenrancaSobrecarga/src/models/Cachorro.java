package models;

public class Cachorro {
	private String nome;

	public Cachorro() {
		//super();
		this.setNome("Rogerinho");
	}
	
	public Cachorro(String nome) {
		//super();
		this.setNome(nome);
	}
	
	public void reagir(String frase) {
		frase = frase.toUpperCase();
		if(frase.equals("OL�")||frase.equals("BOM GAROTO")) {
			System.out.println(this.getNome() + " Abanou o rabo e latiu!");
		} else {
			System.out.println(this.getNome() + " Rosnou!");
		}
	}
	
	public void reagir(int hora) {
		if (hora <= 18) {
			System.out.println(this.getNome() + " Abanou o rabo po�s est� cedo!");
		} else {
			System.out.println(this.getNome() + " Te Ignorou!");
		}
	}
	
	public void reagir(boolean b) {
		if (b) {
			System.out.println(this.getNome() + " Reconheceu o done!");
		} else {
			System.out.println(this.getNome() + " N�o sabe quem � voc�!");
		}
	}
	
	public void reagir(int idade, float peso) {
		String frase = null;
		
		if (idade <5) {
			if (peso<10) {
				frase = this.getNome() + " � Novinho e Leve!";
			} else {
				frase = this.getNome() + " � Novinho e Pesado!";
			}
		} else {
			if (peso<10) {
				frase = this.getNome() + " � Velinho e Leve!";
			} else {
				frase = this.getNome() + " � Velinho e Pesado!";
			}
		}
		
		System.out.println(frase);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
