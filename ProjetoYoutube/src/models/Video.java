package models;

import view.AcoesVideo;

public class Video implements AcoesVideo {
	private String titulo;
	private float avaliacao;
	private long views;
	private long curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.setTitulo(titulo);
		this.setAvaliacao((short) 0);
		this.setViews(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("O Video foi Iniciado!");
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.isReproduzindo()) {
			System.out.println("O Video foi Pausado!");
			this.setReproduzindo(false);
		} else {
			System.out.println("Não foi possivel pausar o video, poís não a um video iniciado!");
		}

	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		System.out.println("O Video recebeu um Like!");
		this.setViews(this.getViews() + 1);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public long getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(long curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
}
