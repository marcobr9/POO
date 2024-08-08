package estoque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque {
	


		
		public ArrayList<Produto> produtos= new ArrayList<>(); 
		
		public void estocar(String nome, String senha,String nproduto, String descricao, int quantidade, double preco, Date validade) {
			Validacao validacao = new Validacao(false, false);
			
			validacao.autenticar(nome,senha);
			
			if(quantidade<0) {
				quantidade=quantidade*(-1);
			}if(preco<0) {
				preco=preco*(-1);
			}
			
			
			if(validacao.getPermissao()==true) {
				
				Produto produto = new Produto(nproduto, descricao, quantidade, preco, validade);
				
				produtos.add(produto);
			}else {
				System.out.println("Sem permissao.");
			}

        }
		
		public void imprime(){
				System.out.print("[");
				for (int i = 0; i < produtos.size(); ++i) {
					if (i > 0) {
						System.out.print(", ");
					}
					System.out.print(produtos.get(i).toString());
				}
				System.out.println("]");
		}
		
		
}