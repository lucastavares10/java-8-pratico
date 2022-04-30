package model;

public class User {
	private String nome;
	private int pontos;
	private boolean moderador;

	public User(String nome, int pontos) {
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = false;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	public boolean isModerador() {
		return moderador;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + "]";
	}

}