package model;

public class Usuario {

	private String nome;
	private String usuario;
	private String senha;

	public Usuario() {
	
	}

	public Usuario(String usuario, String senha, String nome) {
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
