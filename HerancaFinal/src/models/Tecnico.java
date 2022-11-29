package models;

public final class Tecnico extends Aluno{
	private int registroProfissional;
	
	public void praticar() {
		System.out.println("O Tecnico está praticando!");
	}
	
	@Override
	public void pagarMensalidade() {
		// TODO Auto-generated method stub
		System.out.println("O tecnico ira pagar a mensalidade!");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
}
