package estoque;

public class Usuario {
	
	private String nome;
	private String senha;
	private int acesso;
	
	public Usuario(String nome, String senha, int acesso) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.acesso = acesso;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
