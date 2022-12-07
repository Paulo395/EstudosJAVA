package models;

public class Usuario extends Pessoa{
	private String login;
	private int totAssistindo;
	private short contador;
	
	public Usuario(String nome, short idade, String genero, String login) {
		super(nome, idade, genero);
		this.setLogin(login);
		this.setTotAssistindo(0);
	}
	
	public void viuMaisUm() {
		System.out.println("O Usuario " + this.getNome() +" assitiu mais um video!");
		
		this.setTotAssistindo(this.getTotAssistindo() + 1);
		this.setContador((short)(this.getContador() + 1));
		
		if (this.getContador()==5) {
			this.ganharExp();
			this.setContador((short) 0);
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistindo() {
		return totAssistindo;
	}

	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}

	public short getContador() {
		return contador;
	}

	public void setContador(short contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "Usuario[ " + super.toString() + " login=" + login + ", totAssistindo=" + totAssistindo + ", contador=" + contador + "]";
	}
	
}
