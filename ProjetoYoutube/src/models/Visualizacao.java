package models;

public class Visualizacao {
	private Usuario espectador;
	private Video filme;
	
	public Visualizacao(Usuario espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.viuMaisUm();
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		System.out.println("O usuario " + this.espectador.getNome() + " avaliou o video " + 
								this.filme.getTitulo() + "!");
	}
	
	public void avaliar(int nota) {
		System.out.println("O usuario " + espectador.getNome() + 
				" avaliou o video " + this.filme.getTitulo()+ "e deu uma nota inteira!");
		
		filme.setAvaliacao(this.filme.getAvaliacao() + nota);
	}

	public void avaliar(float porcentagem) {
		System.out.println("O usuario " + espectador.getNome() + 
				" avaliou o video " + this.filme.getTitulo()+ " e deu uma nota com porcentagem!");
		
		filme.setAvaliacao((int) filme.getAvaliacao() + porcentagem);
	}

	public Usuario getEspectador() {
		return espectador;
	}

	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
}
