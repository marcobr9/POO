package estoque;

public class Validacao {
	
	private boolean permissao;
	private boolean autenticado;
	private int cont;
	


		
		public Validacao(boolean permissao, boolean autenticado) {
		super();
		this.permissao = permissao;
		this.autenticado = autenticado;
		
	    }

		public boolean permite(boolean autenticado,int cont){
			
			   if(autenticado==true && ListaUsuarios.lista[cont].getAcesso()>1) {
				   permissao=true;
			   }else {
				   try {
				      permissao=false;
				   }catch(NullPointerException e){
					   System.out.println("Permissao invalida.");
				   }
			   }
			return permissao;
		}
		
		public void autenticar(String nome,String senha) {
		
			for(int i=0; ListaUsuarios.lista.length > i; i++){
				   if(ListaUsuarios.lista[i].getNome().equals(nome) && ListaUsuarios.lista[i].getSenha().equals(senha)) {
					   autenticado=true;
					   cont=i;
					   permite(autenticado,cont);
					   break;
				   }else {
					      autenticado=false;
					   }
				   }
				
		}

		public boolean getPermissao() {
			return permissao;
		}

		public boolean getAutenticado() {
			return autenticado;
		}


}
