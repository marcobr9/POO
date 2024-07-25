package estoque;

public class Estoque {
	
	private boolean permissao;
	
	public boolean permite(String nome,String senha,int acesso){
		
		for(int i=0; ListaUsuarios.lista.length < i; i++){
		   if(ListaUsuarios.lista[i].equals(nome) && ListaUsuarios.lista[i].equals(senha) && ListaUsuarios.lista[i].getAcesso()>1) {
			   permissao=true;
		   }else {
			   permissao=false;
		   }
		}
		return permissao;
	}

}
