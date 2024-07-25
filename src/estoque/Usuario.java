package estoque;

public class Usuario {
	
	private String name;
	private String senha;
	private int acesso;
	
	public Usuario(String name, String senha, int acesso) {
		super();
		this.name = name;
		this.senha = senha;
		this.acesso = acesso;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getAcesso() {
		return acesso;
	}


	public void setAcesso(int acesso) {
		this.acesso = acesso;
	}
	
	
	
	
	
	

}
