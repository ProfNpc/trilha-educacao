package com.trilhaeducacao.app1.model;

public class YourStudy {
	
	private String usuario;
	private String senha;

	public YourStudy (String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
			}
	
	public YourStudy() {
		
		super();

	}
	public String getId() {
		return usuario;
	}
	public void setId(String usuario) {
		this.usuario = usuario;
	}

    public String getSenha() {
	return senha;
    }
	public void setSenha (String senha) {
		this.senha = senha;
	}

}


