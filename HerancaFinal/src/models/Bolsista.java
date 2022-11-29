package models;

public final class Bolsista extends Aluno{
	private double bolsa;
	
	public final void renovarBolsa() {
		
	}

	@Override
	public void pagarMensalidade() {
		// TODO Auto-generated method stub
		System.out.println("Pagamento de Bolsista realzado!");
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
}
