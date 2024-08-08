package estoque;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	void testValorProduto() {
        Estoque estoque= new Estoque();
		
		estoque.estocar("Lola","lola14","Caderno","300 paginas, capa dura",156,-19.14,null);
		assertEquals(19.14, estoque.produtos.get(0).getPreco());
	}
	
	@Test
	void testQuantidadeProduto() {
        Estoque estoque= new Estoque();
		
		estoque.estocar("Lola","lola14","Caderno","300 paginas, capa dura",-156,19.14,null);
		assertEquals(156, estoque.produtos.get(0).getQuantidade());
	}
	
	@Test
	void testUsuarioAutenticidade() {
		Estoque estoque= new Estoque();
		estoque.estocar("Lola","lola14","Caderno","300 paginas, capa dura",-156,19.14,null);
		assertEquals(false,Validacao.getPermissao());
	}


}
