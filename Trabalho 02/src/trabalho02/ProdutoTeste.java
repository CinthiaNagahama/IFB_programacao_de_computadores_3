package trabalho02;
public class ProdutoTeste {
	public static void main(String args[]) {
		Produto produto0 = new Produto();
		Venda v0 = new Venda(produto0, 10);
		Compra c0 = new Compra(produto0, 10);
		Venda v1 = new Venda(produto0, 10);
		Compra c1 = new Compra(produto0, 10);
		
		c0.start();
		v0.start();
		c1.start();
		v1.start();
	}
}
