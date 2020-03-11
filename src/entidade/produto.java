package entidade;

public class produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public produto(String nome,double preco,int quantidade) {
		this.nome= nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double valorEstoque() {
		return preco *quantidade;
	}
	
	public void quantidadeEstoque(int quantidade) {
		 this.quantidade +=quantidade;
	}
	
	public void removeEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
		
	public String toString() {
		return nome
				+",$"
				+String.format("%.2f",preco)
				+", "
				+quantidade
				+" total unidades: $"
				+String.format("%.2f",valorEstoque());
	}
	
	
}
