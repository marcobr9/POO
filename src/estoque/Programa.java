package estoque;

public class Programa {
	
	public static void main(String[] args) {
		
		Estoque estoque= new Estoque();
		
		estoque.estocar("Lola","lola14","Caderno","300 paginas, capa dura",156,19.14,null);
		estoque.estocar("Lola","lola14","Livro","Matematica 5 serie",90,120.99,null);
		estoque.imprime();
	}

}
