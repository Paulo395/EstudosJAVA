package models;

public abstract class Pessoa {
	protected String nome;
	protected short idade;
	protected String genero;
	protected short experiencia;
	
	public Pessoa(String nome, short idade, String genero) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setGenero(genero);
		this.setExperiencia((short) 0);
	}

	protected void ganharExp() {
		System.out.println("Você acaba de ganhar experiencia!");
		this.setExperiencia((short)(this.getExperiencia() + 1));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getIdade() {
		return idade;
	}

	public void setIdade(short idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public short getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(short experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", experiencia=" + experiencia
				+ "]";
	}
	
}
